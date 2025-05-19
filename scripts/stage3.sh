#!/bin/bash

password=$(head -n 1 secrets/.psql.pass)

spark-submit --master yarn scrips/app.py

hdfs dfs -cat project/output/model1_predictions/*.csv > output/model1_predictions.csv

hdfs dfs -cat project/output/model2_predictions/*.csv > output/model2_predictions.csv

hdfs dfs -cat project/output/evaluation.csv/*.csv > output/evaluation.csv

mkdir ./models

hdfs dfs -get project/models/model1 models/model1

hdfs dfs -get project/models/model2 models/model2

echo "Run formatter"
sh ./scripts/format.sh

echo "Run pylint"
pylint --disable=R,C  ./scripts