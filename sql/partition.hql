SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing=true;


USE team1_projectdb;

DROP TABLE IF EXISTS records_part;

create external table records_part (
    host_since BIGINT,
    host_response_time STRING,
    host_response_rate INT,
    host_is_superhost BOOLEAN,
    host_has_profile_pic  BOOLEAN,
    host_identity_verified BOOLEAN,
    neighbourhood string,
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
    instant_bookable  BOOLEAN,
    cancellation_policy STRING,
    require_guest_profile_picture BOOLEAN,
    month string,
    Kitchen BOOLEAN,
    Wifi BOOLEAN,
    Essentials BOOLEAN,
    TV BOOLEAN,
    `Air conditioning` BOOLEAN,
    Elevator BOOLEAN,
    Washer BOOLEAN,
    Hangers BOOLEAN,
    Iron BOOLEAN,
    `Laptop friendly workspace` BOOLEAN,
    `Family/kid friendly` BOOLEAN,
    `Hot water` BOOLEAN,
    `Cable TV` BOOLEAN,
    `Free parking on premises` BOOLEAN,
    `Hair dryer` BOOLEAN,
    `Smoking allowed` BOOLEAN,
    Doorman BOOLEAN,
    `Dishes and silverware` BOOLEAN,
    `Buzzer/wireless intercom` BOOLEAN,
    Refrigerator BOOLEAN
)
partitioned by (month STRING)
clustered by (neighbourhood) INTO 4 BUCKETS
stored as avro LOCATION 'project/hive/warehouse/records_part'
tblproperties ('AVRO.COMPRESS'='SNAPPY');

SELECT * FROM records LIMIT 2;

INSERT INTO records_part SELECT * FROM records;