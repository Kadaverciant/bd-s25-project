DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";

USE team1_projectdb;

DROP TABLE IF EXISTS records;
CREATE EXTERNAL TABLE records STORED AS AVRO LOCATION 'project/warehouse/avro_snappy/records'
TBLPROPERTIES ('avro.schema.url'='project/warehouse/avro_snappy/avsc/records.avsc');

ALTER TABLE records CHANGE COLUMN host_since host_since date;

SELECT COUNT(*) FROM records;

DESCRIBE FORMATTED records;

SELECT * FROM records limit 5;