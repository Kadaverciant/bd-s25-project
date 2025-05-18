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
    amenities STRING,
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
    cable_tv BOOLEAN,
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
LOCATION 'project/hive/warehouse/records_part';

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
    amenities,
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
    kitchen,
    wifi,
    essentials,
    tv,
    air_conditioning,
    elevator,
    washer,
    hangers,
    iron,
    laptop_friendly_workspace,
    family_kid_friendly,
    hot_water,
    cable_tv,
    free_parking_on_premises,
    hair_dryer,
    smoking_allowed,
    doorman,
    dishes_and_silverware,
    buzzer_wireless_intercom,
    refrigerator,
    month
FROM records;

SELECT * FROM records_part LIMIT 1;

DROP TABLE IF EXISTS records;