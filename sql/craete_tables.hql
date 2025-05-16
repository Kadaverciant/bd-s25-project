DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";

USE team1_projectdb;

DROP TABLE IF EXISTS records;
CREATE EXTERNAL TABLE records STORED AS PARQUET LOCATION 'project/warehouse/records'
TBLPROPERTIES ('parquet.schema.respect'='true');

EXPLAIN ANALYZE SELECT COUNT(*) FROM records;
