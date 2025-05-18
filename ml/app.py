from pyspark.ml import Pipeline
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.ml.feature import (
    OneHotEncoder,
    StringIndexer,
    VectorAssembler,
)
from pyspark.ml.regression import LinearRegression, RandomForestRegressor
from pyspark.ml.tuning import CrossValidator, ParamGridBuilder
from pyspark.sql import SparkSession
from pyspark.sql.functions import (
    col,
    to_date,
)

from pyspark.ml import Transformer
from pyspark.ml.param.shared import Param, Params
from pyspark.sql.functions import col, radians, sin, cos, sqrt, split
from pyspark.sql import DataFrame
import pyspark.sql.functions as F
from pyspark.ml.feature import Tokenizer, Word2Vec, SQLTransformer


class GeoToECEFTransformer(Transformer):
    def __init__(self, lat_col="latitude", lon_col="longitude", alt_col=None):
        super().__init__()
        self.lat_col = lat_col
        self.lon_col = lon_col
        self.alt_col = alt_col

    def _transform(self, df: DataFrame) -> DataFrame:
        # Constants
        a = 6378137.0
        e_sq = 6.69437999014e-3

        # Use altitude if available, else 0
        if self.alt_col and self.alt_col in df.columns:
            alt = col(self.alt_col)
        else:
            alt = F.lit(0.0)

        lat_rad = radians(col(self.lat_col))
        lon_rad = radians(col(self.lon_col))

        N = a / sqrt(1 - e_sq * sin(lat_rad)**2)

        
        x = (N + alt) * cos(lat_rad) * cos(lon_rad)
        y = (N + alt) * cos(lat_rad) * sin(lon_rad)
        z = (N * (1 - e_sq) + alt) * sin(lat_rad)

        return df.withColumn("x", x).withColumn("y", y).withColumn("z", z)

warehouse = "project/hive/warehouse"


print("Start connection...")

spark = (
    SparkSession.builder.appName("ML_team1")
    .master("yarn")
    .config("hive.metastore.uris", "thrift://hadoop-02.uni.innopolis.ru:9883")
    .config("spark.sql.warehouse.dir", warehouse)
    .config("spark.sql.avro.compression.codec", "snappy")
    .config("spark.hadoop.hive.metastore.client.socket.timeout", "300")
    .enableHiveSupport()
    .getOrCreate()
)
sc = spark.sparkContext
sc.setLogLevel("ERROR")

spark.sql("USE team1_projectdb")
spark.sql("SHOW TABLES").show()


df = spark.read.format("parquet").table("team1_projectdb.records_part")
df = df.dropna(subset=["review_scores_rating"])

df = df.withColumn("host_since", to_date(col("host_since").cast("string"), "yyyyMMdd"))
df = df.filter(col("review_scores_rating").isNotNull())

split_amenities = SQLTransformer(statement="""
    SELECT *, split(coalesce(amenities, ''), ',\\s*') AS amenities_tokens FROM __THIS__
""")

word2vec = Word2Vec(
    inputCol="amenities_tokens",
    outputCol="amenities_vec",
    vectorSize=8,  
    minCount=1
)

geo_transformer = GeoToECEFTransformer()

df = geo_transformer.transform(df)

categorical_cols = [
    "host_response_time",
    "neighbourhood",
    "property_type",
    "room_type",
    "bed_type",
    "cancellation_policy",
    "month",
]

boolean_cols = [
    "host_is_superhost",
    "host_has_profile_pic",
    "host_identity_verified",
    "instant_bookable",
    "require_guest_profile_picture",
    "kitchen",
    "wifi",
    "essentials",
    "tv",
    "air_conditioning",
    "elevator",
    "washer",
    "hangers",
    "iron",
    "laptop_friendly_workspace",
    "family_kid_friendly",
    "hot_water",
    "cable_tv",
    "free_parking_on_premises",
    "hair_dryer",
    "smoking_allowed",
    "doorman",
    "dishes_and_silverware",
    "buzzer_wireless_intercom",
    "refrigerator",
]

numerical_cols = [
    "x",
    "y",
    "z",
    "accommodates",
    "bathrooms",
    "bedrooms",
    "beds",
    "price",
    "security_deposit",
    "cleaning_fee",
    "guests_included",
    "extra_people",
    "minimum_nights",
    "maximum_nights",
]

indexers = [
    StringIndexer(inputCol=col, outputCol=col + "_index", handleInvalid="keep")
    for col in categorical_cols
]
encoders = [
    OneHotEncoder(inputCol=col + "_index", outputCol=col + "_vec")
    for col in categorical_cols
]


encoded_cols = [encoder.getOutputCol() for encoder in encoders]
assembler_inputs = encoded_cols + boolean_cols + numerical_cols
assembler_inputs = encoded_cols + boolean_cols + numerical_cols + ["amenities_vec"]

assembler = VectorAssembler(inputCols=assembler_inputs, outputCol="features")

print("Start pipeline...")
pipeline = Pipeline(stages=[
    split_amenities,
    word2vec,
    geo_transformer,  
    *indexers,
    *encoders,
    assembler
])

pipeline_model = pipeline.fit(df)
df_prepared = pipeline_model.transform(df)
print("End pipeline...")
print("Start spliting and saving to JSON...")

train_df, test_df = df_prepared.randomSplit([0.8, 0.2], seed=42)

train_df.select("features", "review_scores_rating").write.mode("overwrite").json(
    "project/data/train"
)
test_df.select("features", "review_scores_rating").write.mode("overwrite").json(
    "project/data/test"
)

print("First model training...")
lr = LinearRegression(featuresCol="features", labelCol="review_scores_rating")

paramGrid = (
    ParamGridBuilder()
    .addGrid(lr.regParam, [0.01, 0.1, 1.0])
    .addGrid(lr.elasticNetParam, [0.0, 0.5, 1.0])
    .build()
)

evaluator = RegressionEvaluator(
    labelCol="review_scores_rating", predictionCol="prediction", metricName="rmse"
)


mae_evaluator = RegressionEvaluator(
    labelCol="review_scores_rating",     
    predictionCol="prediction",
    metricName="mae"
)
cv = CrossValidator(
    estimator=lr,
    estimatorParamMaps=paramGrid,
    evaluator=evaluator,
    numFolds=3,
)

cv_model = cv.fit(train_df)
best_model = cv_model.bestModel
best_model.save("project/models/model1")

predictions = best_model.transform(test_df)
print("First model Prediction...")
predictions.select("review_scores_rating", "prediction").coalesce(1).write.mode(
    "overwrite"
).csv("project/output/model1_predictions", header=True)

rmse = evaluator.evaluate(predictions)
mae = mae_evaluator.evaluate(predictions)
print("Metrics for LR: ",rmse, mae)
print("Second model training...")
rf = RandomForestRegressor(
    featuresCol="features",
    labelCol="review_scores_rating",
    seed=42,
)

paramGrid_rf = (
    ParamGridBuilder()
    .addGrid(rf.numTrees, [5, 10])
    .addGrid(rf.maxDepth, [5, 10])
    .build()
)

evaluator_rf = RegressionEvaluator(
    labelCol="review_scores_rating",
    predictionCol="prediction",
    metricName="rmse",
)

cv_rf = CrossValidator(
    estimator=rf,
    estimatorParamMaps=paramGrid_rf,
    evaluator=evaluator_rf,
    numFolds=3,
)

cv_model_rf = cv_rf.fit(train_df)
best_model_rf = cv_model_rf.bestModel
best_model_rf.save("project/models/model2")
print("Second model Prediction...")
predictions_rf = best_model_rf.transform(test_df)

predictions_rf.select("review_scores_rating", "prediction").coalesce(1).write.mode(
    "overwrite"
).csv("project/output/model2_predictions", header=True)

rmse_rf = evaluator_rf.evaluate(predictions_rf)
mae_rf = mae_evaluator.evaluate(predictions_rf)
print("Metrics for RF: ",rmse_rf, mae_rf)

models = [[str(best_model), rmse, mae], [str(best_model_rf), rmse_rf, mae_rf]]

df = spark.createDataFrame(models, ["model", "RMSE", "MAE"])
df.show(truncate=False)

# Save it to HDFS
df.coalesce(1).write.mode("overwrite").format("csv").option("sep", ",").option(
    "header", "true"
).save("project/output/evaluation.csv")

predictions.write.mode("overwrite").saveAsTable("team1_projectdb.predictions_lr")
predictions_rf.write.mode("overwrite").saveAsTable("team1_projectdb.predictions_rf")

metrics = spark.createDataFrame([
    ("lr", rmse, mae),
    ("rf", rmse_rf, mae_rf)
], ["model_name", "rmse", "mae"])

metrics.write.mode("overwrite").saveAsTable("team1_projectdb.evaluation_results")