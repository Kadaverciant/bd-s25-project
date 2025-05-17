#!/bin/bash
PROJECT_FOLDER="/user/team1/project"

password=$(head -n 1 secrets/.psql.pass)

## q1 insight
#echo "First insight"
#beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q1.hql
#
#
## q2 insight
#echo "Second insight"
#beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q2.hql
#

#q3 insight
#echo "Third insight"
#beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q3.hql

#q4 insight
echo "Fourth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q4.hql