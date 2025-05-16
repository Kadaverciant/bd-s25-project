SET hive.exec.dynamic.partition = true;
SET hive.exec.dynamic.partition.mode = nonstrict;
SET hive.enforce.bucketing=true;


USE team1_projectdb;

DROP TABLE IF EXISTS records_part;

create external table records_part (
    host_since BIGINT,
    host_response_time varchar(200),
    host_response_rate INT,
    host_is_superhost BOOLEAN,
    host_has_profile_pic  BOOLEAN,
    host_identity_verified BOOLEAN,
    neighbourhood varchar(200),
    latitude decimal(10,2),
    longitude decimal(10,2),
    property_type varchar(200),
    room_type varchar(200),
    accommodates INT,
    bathrooms decimal(10,2),
    bedrooms INT,
    beds INT,
    bed_type varchar(200),
    price decimal(10,2),
    security_deposit decimal(10,2),
    cleaning_fee decimal(10,2),
    guests_included INT,
    extra_people decimal(10,2),
    minimum_nights INT,
    maximum_nights INT,
    review_scores_rating decimal(10,2),
    instant_bookable  BOOLEAN,
    cancellation_policy varchar(200),
    require_guest_profile_picture BOOLEAN,
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
partitioned by (month varchar(200))
clustered by (neighbourhood) INTO 4 BUCKETS
stored as avro LOCATION 'project/hive/warehouse/records_part'
tblproperties ('AVRO.COMPRESS'='SNAPPY');

SELECT * FROM records LIMIT 2;

INSERT INTO records_part SELECT * FROM records;