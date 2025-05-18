#!/bin/bash

echo "Start building HIVE table"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/create_tables.hql

echo "Start partitioning"
sh ./scripts/partition.sh

echo "Perform EDA"
sh ./scripts/get_insights.sh

echo "Run pylint"
pylint --disable=R,C  .\scripts\
