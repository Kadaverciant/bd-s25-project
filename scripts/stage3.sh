#!/bin/bash

password=$(head -n 1 secrets/.psql.pass)

spark-submit --master yarn scrips/app.py

hdfs dfs -cat project/output/model1_predictions/*.csv > output/model1_predictions.csv

hdfs dfs -cat project/output/model2_predictions/*.csv > output/model2_predictions.csv

hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv

mkdir ./models

hdfs dfs -get project/models/model1 models/model1

hdfs dfs -get project/models/model2 models/model2

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -e "
  INSERT OVERWRITE DIRECTORY '/user/team1/project/output/grid_search_results'
  ROW FORMAT DELIMITED
  FIELDS TERMINATED BY ','
  STORED AS TEXTFILE
  SELECT * FROM team1_projectdb.grid_search_results;"

echo "model_name,RMSE,MAE" > output/grid_search_results.csv
hdfs dfs -cat ./project/output/grid_search_results/* >> output/grid_search_results.csv
head -n 10 output/grid_search_results.csv

echo "Run formatter"
sh ./scripts/format.sh

echo "Run pylint"
pylint --disable=R,C  ./scripts