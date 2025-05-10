START TRANSACTION;

DROP TABLE IF EXISTS records CASCADE;

CREATE TABLE IF NOT EXISTS records (
    host_since date,
    host_response_time varchar(30),
    host_response_rate integer,
    host_is_superhost boolean,
    host_has_profile_pic  boolean,
    host_identity_verified boolean,
    neighbourhood varchar(50),
    latitude numeric,
    longitude numeric,
    property_type varchar(50),
    room_type varchar(50),
    accommodates integer,
    bathrooms numeric,
    bedrooms numeric, -- fix later
    beds numeric, -- fix later
    bed_type varchar(30),
    price numeric,
    security_deposit numeric,
    cleaning_fee numeric,
    guests_included integer,
    extra_people numeric,
    minimum_nights integer,
    maximum_nights integer,
    review_scores_rating numeric,
    instant_bookable  boolean,
    cancellation_policy varchar(50),
    require_guest_profile_picture boolean,
    month varchar(20),
    Kitchen boolean,
    Wifi boolean,
    Essentials boolean,
    TV boolean,
    "Air conditioning" boolean,
    Elevator boolean,
    Washer boolean,
    Hangers boolean,
    Iron boolean,
    "Laptop friendly workspace" boolean,
    "Family/kid friendly" boolean,
    "Hot water" boolean,
    "Cable TV" boolean,
    "Free parking on premises" boolean,
    "Hair dryer" boolean,
    "Smoking allowed" boolean,
    Doorman boolean,
    "Dishes and silverware" boolean,
    "Buzzer/wireless intercom" boolean,
    Refrigerator boolean
);

COMMIT;