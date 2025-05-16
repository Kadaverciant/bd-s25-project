#!/bin/bash
PROJECT_FOLDER="/user/team1/project"

password=$(head -n 1 secrets/.psql.pass)

# q1 insight
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/partition.hql