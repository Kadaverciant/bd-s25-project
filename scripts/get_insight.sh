#!/bin/bash
PROJECT_FOLDER="/user/team1/project"

password=$(head -n 1 secrets/.psql.pass)

# q1 insight
echo "First insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > outputs/q1.csv

# q2 insight
echo "Second insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q2.hql --hiveconf hive.resultset.use.unique.column.names=false > outputs/q2.csv

# q3 insight
echo "Third insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q3.hql --hiveconf hive.resultset.use.unique.column.names=false > outputs/q3.csv

# q4 insight
echo "Fourth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q4.hql --hiveconf hive.resultset.use.unique.column.names=false > outputs/q4.csv

# q5 insight
echo "Fifth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q5.hql --hiveconf hive.resultset.use.unique.column.names=false > outputs/q5.csv

hadoop fs -mkdir -p /user/team1/project/output

for i in {1..5}; do
  echo "Export table q${i}_results into CSV..."

  beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -e "
  INSERT OVERWRITE DIRECTORY '/user/team1/project/output/q${i}.csv'
  ROW FORMAT DELIMITED
  FIELDS TERMINATED BY ','
  STORED AS TEXTFILE
  SELECT * FROM team1_projectdb.q${i}_results;"
done