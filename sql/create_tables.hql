DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";

USE team1_projectdb;

DROP TABLE IF EXISTS records;
-- CREATE EXTERNAL TABLE records (
--     host_since BIGINT,
--     host_response_time STRING,
--     host_response_rate INT,
--     host_is_superhost BOOLEAN,
--     host_has_profile_pic BOOLEAN,
--     host_identity_verified BOOLEAN,
--     neighbourhood STRING,
--     latitude FLOAT,
--     longitude FLOAT,
--     property_type STRING,
--     room_type STRING,
--     accommodates INT,
--     bathrooms FLOAT,
--     bedrooms INT,
--     beds INT,
--     bed_type STRING,
--     amenities STRING,
--     price FLOAT,
--     security_deposit FLOAT,
--     cleaning_fee FLOAT,
--     guests_included INT,
--     extra_people FLOAT,
--     minimum_nights INT,
--     maximum_nights INT,
--     review_scores_rating FLOAT,
--     instant_bookable BOOLEAN,
--     cancellation_policy STRING,
--     require_guest_profile_picture BOOLEAN,
--     month STRING,
--     kitchen BOOLEAN,
--     wifi BOOLEAN,
--     essentials BOOLEAN,
--     tv BOOLEAN,
--     air_conditioning BOOLEAN,
--     elevator BOOLEAN,
--     washer BOOLEAN,
--     hangers BOOLEAN,
--     iron BOOLEAN,
--     laptop_friendly_workspace BOOLEAN,
--     family_kid_friendly BOOLEAN,
--     hot_water BOOLEAN,
--     cable_tv BOOLEAN,
--     free_parking_on_premises BOOLEAN,
--     hair_dryer BOOLEAN,
--     smoking_allowed BOOLEAN,
--     doorman BOOLEAN,
--     dishes_and_silverware BOOLEAN,
--     buzzer_wireless_intercom BOOLEAN,
--     refrigerator BOOLEAN
-- )
-- STORED AS PARQUET LOCATION 'project/warehouse/records';
--
CREATE EXTERNAL TABLE records STORED AS AVRO LOCATION '/user/team1/project/warehouse/records'
TBLPROPERTIES ('avro.schema.url'='/user/team1/project/warehouse/avsc/records.avsc');

EXPLAIN ANALYZE SELECT COUNT(*) FROM records;
SELECT COUNT(*) FROM records;
SELECT * FROM records LIMIT 10;
