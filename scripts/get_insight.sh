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

hadoop fs -mkdir -p /user/team1/project/output

for i in {1..5}; do
  echo "Export table q${i}_results into CSV..."

  beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p "$password" -e "
  INSERT OVERWRITE DIRECTORY '/user/team1/project/output/q${i}'
  ROW FORMAT DELIMITED
  FIELDS TERMINATED BY ','
  STORED AS TEXTFILE
  SELECT * FROM team1_projectdb.q${i}_results;"
done

echo "neighbourhood,avg_price,median_price,price_stddev,min_price,max_price,avg_rating,superhost_percentage,entire_home_ratio,listings_count" > output/q1.csv
hdfs dfs -cat ./project/output/q1/* >> output/q1.csv
cat output/q1.csv

echo "room_type,avg_price,median_price,air_cond_pct,wifi_pct,fridge_pct,hot_water_pct,essentials_pct,washer_pct,avg_bathrooms,avg_bedrooms,listings_count" > output/q2.csv
hdfs dfs -cat ./project/output/q2/* >> output/q2.csv
cat output/q2.csv

echo "host_has_profile_pic,host_is_superhost,host_identity_verified,avg_rating,avg_price,listings_count" > output/q3.csv
hdfs dfs -cat ./project/output/q3/* >> output/q3.csv
cat output/q3.csv

echo "month,property_type,min_price,avg_price,max_price" > output/q4.csv
hdfs dfs -cat ./project/output/q4/* >> output/q4.csv
cat output/q4.csv

echo "bucket_num,bucket_min_price,bucket_max_price,strategy,count_listings,avg_rating,avg_rating" > output/q5.csv
hdfs dfs -cat ./project/output/q5/* >> output/q5.csv
cat output/q5.csv