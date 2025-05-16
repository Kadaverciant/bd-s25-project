DROP DATABASE IF EXISTS team1_projectdb CASCADE;

CREATE DATABASE team1_projectdb LOCATION "project/hive/warehouse";

USE team1_projectdb;

DROP TABLE IF EXISTS records;
CREATE EXTERNAL TABLE records (
    host_since BIGINT,
    host_response_time STRING,
    host_response_rate INT,
    host_is_superhost BOOLEAN,
    host_has_profile_pic BOOLEAN,
    host_identity_verified BOOLEAN,
    neighbourhood STRING,
    latitude FLOAT,
    longitude FLOAT,
    property_type STRING,
    room_type STRING,
    accommodates INT,
    bathrooms FLOAT,
    bedrooms INT,
    beds INT,
    bed_type STRING,
    price FLOAT,
    security_deposit FLOAT,
    cleaning_fee FLOAT,
    guests_included INT,
    extra_people FLOAT,
    minimum_nights INT,
    maximum_nights INT,
    review_scores_rating FLOAT,
    instant_bookable BOOLEAN,
    cancellation_policy STRING,
    require_guest_profile_picture BOOLEAN,
    kitchen boolean,
    wifi boolean,
    essentials boolean,
    tv boolean,
    air_conditioning boolean,
    elevator boolean,
    washer boolean,
    hangers boolean,
    iron boolean,
    laptop_friendly_workspace boolean,
    family_kid_friendly boolean,
    hot_water boolean,
    cable_tv boolean,
    free_parking_on_premises boolean,
    hair_dryer boolean,
    smoking_allowed boolean,
    doorman boolean,
    dishes_and_silverware boolean,
    buzzer_wireless_intercom boolean,
    refrigerator boolean
)
STORED AS PARQUET LOCATION 'project/warehouse/records';

EXPLAIN ANALYZE SELECT COUNT(*) FROM records;
SELECT COUNT(*) FROM records;
SELECT * FROM records LIMIT 10;
