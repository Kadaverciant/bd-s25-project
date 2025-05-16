SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing=true;

USE team1_projectdb;

DROP TABLE IF EXISTS records_part;

CREATE EXTERNAL TABLE records_part (
    host_since DATE,
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
    month string,
    kitchen BOOLEAN,
    wifi BOOLEAN,
    essentials BOOLEAN,
    tv BOOLEAN,
    air_conditioning BOOLEAN,
    elevator BOOLEAN,
    washer BOOLEAN,
    hangers BOOLEAN,
    iron BOOLEAN,
    laptop_friendly_workspace BOOLEAN,
    family_kid_friendly BOOLEAN,
    hot_water BOOLEAN,
    cable_TV BOOLEAN,
    free_parking_on_premises BOOLEAN,
    hair_dryer BOOLEAN,
    smoking_allowed BOOLEAN,
    doorman BOOLEAN,
    dishes_and_silverware BOOLEAN,
    buzzer_wireless_intercom BOOLEAN,
    refrigerator BOOLEAN
)
PARTITIONED BY (month STRING)
CLUSTERED BY (neighbourhood) INTO 4 BUCKETS
STORED AS AVRO
LOCATION 'project/hive/warehouse/records_part'
TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');

SELECT * FROM records LIMIT 2;

INSERT INTO TABLE records_part PARTITION(month)
SELECT
    cast(to_date(from_utc_timestamp(host_since, "+00")) as date) as host_since,
    host_response_time,
    host_response_rate,
    host_is_superhost,
    host_has_profile_pic,
    host_identity_verified,
    neighbourhood,
    latitude,
    longitude,
    property_type,
    room_type,
    accommodates,
    bathrooms,
    bedrooms,
    beds,
    bed_type,
    price,
    security_deposit,
    cleaning_fee,
    guests_included,
    extra_people,
    minimum_nights,
    maximum_nights,
    review_scores_rating,
    instant_bookable,
    cancellation_policy,
    require_guest_profile_picture,
    Kitchen,
    Wifi,
    Essentials,
    TV,
    "Air conditioning",
    Elevator,
    Washer,
    Hangers,
    Iron,
    "Laptop friendly workspace",
    "Family/kid friendly",
    "Hot water",
    "Cable TV",
    "Free parking on premises",
    "Hair dryer",
    "Smoking allowed",
    Doorman,
    "Dishes and silverware",
    "Buzzer/wireless intercom",
    Refrigerator
    month
FROM records;