SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing=true;

USE team1_projectdb;

DROP TABLE IF EXISTS records_part;

CREATE EXTERNAL TABLE records_part (
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
    air_conditioning BOOLEAN,
    Elevator BOOLEAN,
    Washer BOOLEAN,
    Hangers BOOLEAN,
    Iron BOOLEAN,
    Laptop_friendly_workspace BOOLEAN,
    Family_kid_friendly BOOLEAN,
    Hot_water BOOLEAN,
    Cable_TV BOOLEAN,
    Free_parking_on_premises BOOLEAN,
    Hair_dryer BOOLEAN,
    Smoking_allowed BOOLEAN,
    Doorman BOOLEAN,
    Dishes_and_silverware BOOLEAN,
    Buzzer_wireless_intercom BOOLEAN,
    Refrigerator BOOLEAN
)
PARTITIONED BY (month STRING)
CLUSTERED BY (neighbourhood) INTO 4 BUCKETS
STORED AS AVRO
LOCATION 'project/hive/warehouse/records_part'
TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');

SELECT * FROM records LIMIT 2;

INSERT INTO records_part SELECT * FROM records;