DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";

USE team1_projectdb;

DROP TABLE IF EXISTS records;
CREATE EXTERNAL TABLE records STORED AS AVRO LOCATION 'project/warehouse/arecords'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/records.avsc');

SELECT COUNT(*) FROM records;
