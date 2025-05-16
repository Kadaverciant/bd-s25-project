#!/bin/bash

PROJECT_FOLDER="/user/team1/project"
WAREHOUSE_FOLDER="$PROJECT_FOLDER/warehouse"
AVRO_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/avro_snappy"
PARQUET_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/parquet_snappy"
AVRO_GZIP_FOLDER="$WAREHOUSE_FOLDER/avro_gzip"
PARQUET_GZIP_FOLDER="$WAREHOUSE_FOLDER/parquet_gzip"

hdfs dfs -rm -r /project/projectdata