DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb;

USE team1_projectdb;

DROP TABLE IF EXISTS records;
CREATE EXTERNAL TABLE records STORED AS AVRO LOCATION '/user/team1/project/warehouse/avro_snappy/records'
TBLPROPERTIES ('avro.schema.url'='/user/team1/project/warehouse/avro_snappy/avsc/records.avsc');

SELECT COUNT(*) FROM records;