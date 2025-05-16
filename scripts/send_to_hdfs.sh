password=$(head -n 1 secrets/.psql.pass)

rm -rf outputs
mkdir -p outputs

PROJECT_FOLDER="/user/team1/project"
WAREHOUSE_FOLDER="$PROJECT_FOLDER/warehouse"
AVRO_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/avro_snappy"
PARQUET_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/parquet_snappy"
AVRO_GZIP_FOLDER="$WAREHOUSE_FOLDER/avro_gzip"
PARQUET_GZIP_FOLDER="$WAREHOUSE_FOLDER/parquet_gzip"

# Check if the folder exists
hdfs dfs -test -d "$PROJECT_FOLDER"

# Check the exit status of the previous command
if [ $? -eq 0 ]; then
    echo "Project folder $PROJECT_FOLDER exists in HDFS. Start cleaning."
    hdfs dfs -rm -r -f "$PROJECT_FOLDER"
    echo "Cleaned"
else
    echo "Folder $PROJECT_FOLDER does not exist in HDFS"
fi

echo "Creating project folder: $PROJECT_FOLDER"

hdfs dfs -mkdir -p "$PROJECT_FOLDER"
hdfs dfs -chmod -R 755 "$PROJECT_FOLDER"

echo "Creating warehouse folder: $WAREHOUSE_FOLDER"

hdfs dfs -mkdir -p "$WAREHOUSE_FOLDER"
hdfs dfs -chmod 755 "$WAREHOUSE_FOLDER"

echo "Creating warehouse folders (avro_snappy, parquet_snappy, avro_gzip, parquet_gzip): $WAREHOUSE_FOLDER"

hdfs dfs -mkdir -p "$AVRO_SNAPPY_FOLDER"
hdfs dfs -chmod 755 "$AVRO_SNAPPY_FOLDER"
hdfs dfs -mkdir -p "$PARQUET_SNAPPY_FOLDER"
hdfs dfs -chmod 755 "$PARQUET_SNAPPY_FOLDER"
hdfs dfs -mkdir -p "$AVRO_GZIP_FOLDER"
hdfs dfs -chmod 755 "$AVRO_GZIP_FOLDER"
hdfs dfs -mkdir -p "$PARQUET_GZIP_FOLDER"
hdfs dfs -chmod 755 "$PARQUET_GZIP_FOLDER"

echo "Folder structure created successfully"

start_time=$(date +%s)

echo "Start loading AVRO + SNAPPY"
sqoop import \
  --connect "jdbc:postgresql://hadoop-04.uni.innopolis.ru/team1_projectdb" \
  --username team1\
  --password "$password" \
  --compression-codec=snappy \
  --compress \
  --as-avrodatafile \
  --warehouse-dir=$AVRO_SNAPPY_FOLDER \
  --m 1 \
  --outdir "$(pwd)/outputs" \
  --table records

end_time=$(date +%s)
execution_time=$((end_time - start_time))

hdfs dfs -mkdir -p "$AVRO_SNAPPY_FOLDER/avsc"
hdfs dfs -put outputs/*.avsc "$AVRO_SNAPPY_FOLDER/avsc"

echo "Sqoop import completed in $execution_time seconds"