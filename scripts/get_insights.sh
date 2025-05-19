#!/bin/bash
PROJECT_FOLDER="/user/team1/project"

password=$(head -n 1 secrets/.psql.pass)

# q1 insight
echo "First insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q1.hql

# q2 insight
echo "Second insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q2.hql

# q3 insight
echo "Third insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q3.hql

# q4 insight
echo "Fourth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q4.hql

# q5 insight
echo "Fifth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q5.hql

echo "Sixth insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q6.hql


echo "Seventh insight"
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -f sql/q7.hql

hadoop fs -mkdir -p /user/team1/project/output

for i in {1..7}; do
  echo "Export table q${i}_results into CSV..."

  beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -e "
  INSERT OVERWRITE DIRECTORY '/user/team1/project/output/q${i}'
  ROW FORMAT DELIMITED
  FIELDS TERMINATED BY ','
  STORED AS TEXTFILE
  SELECT * FROM team1_projectdb.q${i}_results;"
done

echo "neighbourhood,price,review_scores_rating" > output/q1.csv
hdfs dfs -cat ./project/output/q1/* >> output/q1.csv
head -n 10 output/q1.csv

echo "maximum_nights,minimum_nights,cancellation_policy,review_scores_rating,price,price_bucket" > output/q2.csv
hdfs dfs -cat ./project/output/q2/* >> output/q2.csv
head -n 10 output/q2.csv

echo "review_scores_rating,price,verification_status" > output/q3.csv
hdfs dfs -cat ./project/output/q3/* >> output/q3.csv
head -n 10 output/q3.csv

echo "month,property_type,room_type,price,review_scores_rating,property_description,in_top_property,in_top_property_room" > output/q4.csv
hdfs dfs -cat ./project/output/q4/* >> output/q4.csv
head -n 10 output/q4.csv

echo "review_scores_rating,host_response_time,price_bucket,host_response_rate_bucket" > output/q5.csv
hdfs dfs -cat ./project/output/q5/* >> output/q5.csv
head -n 10 output/q5.csv

echo "latitude,longitude,price,review_scores_rating,neighbourhood,in_top_price,in_top_rating" > output/q6.csv
hdfs dfs -cat ./project/output/q6/* >> output/q6.csv
head -n 10 output/q6.csv

echo "review_scores_rating,price,month,amenity_status" > output/q7.csv
hdfs dfs -cat ./project/output/q7/* >> output/q7.csv
head -n 10 output/q7.csv