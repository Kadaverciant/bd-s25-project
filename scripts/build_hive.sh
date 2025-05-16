#!/bin/bash

PROJECT_FOLDER="/user/team1/project"
WAREHOUSE_FOLDER="$PROJECT_FOLDER/warehouse"
AVRO_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/avro_snappy"
PARQUET_SNAPPY_FOLDER="$WAREHOUSE_FOLDER/parquet_snappy"
AVRO_GZIP_FOLDER="$WAREHOUSE_FOLDER/avro_gzip"
PARQUET_GZIP_FOLDER="$WAREHOUSE_FOLDER/parquet_gzip"

password=$(head -n 1 secrets/.psql.pass)
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/craete_tables.hql