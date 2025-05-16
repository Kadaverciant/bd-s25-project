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
    Kitchen BOOLEAN,
    Wifi BOOLEAN,
    Essentials BOOLEAN,
    TV BOOLEAN,
    Air_conditioning BOOLEAN,
    Elevator BOOLEAN,
    Washer BOOLEAN,
    Hangers BOOLEAN,
    Iron BOOLEAN,
    a BOOLEAN,
    b BOOLEAN,
    c BOOLEAN,
    d BOOLEAN,
    e BOOLEAN,
    f BOOLEAN,
    g BOOLEAN,
    Doorman BOOLEAN,
    h BOOLEAN,
    j BOOLEAN,
    k BOOLEAN
)
STORED AS PARQUET LOCATION 'project/warehouse/records';

EXPLAIN ANALYZE SELECT COUNT(*) FROM records;
SELECT COUNT(*) FROM records;
