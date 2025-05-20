USE team1_projectdb;

DROP TABLE IF EXISTS q7_results;

CREATE TABLE q7_results AS
WITH amenity_combinations AS (
    SELECT
        review_scores_rating,
        price,
		month,
        CASE
            WHEN wifi AND air_conditioning AND hot_water AND refrigerator
                THEN 'all_amenities'
            WHEN wifi AND air_conditioning AND hot_water
                THEN 'wifi_ac_hotwater'
            WHEN wifi AND air_conditioning AND refrigerator
                THEN 'wifi_ac_fridge'
            WHEN wifi AND hot_water AND refrigerator
                THEN 'wifi_hotwater_fridge'
            WHEN air_conditioning AND hot_water AND refrigerator
                THEN 'ac_hotwater_fridge'
            WHEN wifi AND air_conditioning
                THEN 'wifi_ac'
            WHEN wifi AND hot_water
                THEN 'wifi_hotwater'
            WHEN wifi AND refrigerator
                THEN 'wifi_fridge'
            WHEN air_conditioning AND hot_water
                THEN 'ac_hotwater'
            WHEN air_conditioning AND refrigerator
                THEN 'ac_fridge'
            WHEN hot_water AND refrigerator
                THEN 'hotwater_fridge'
            WHEN wifi
                THEN 'wifi_only'
            WHEN air_conditioning
                THEN 'ac_only'
            WHEN hot_water
                THEN 'hotwater_only'
            WHEN refrigerator
                THEN 'fridge_only'
            ELSE 'no_amenities'
        END AS amenity_status
    FROM records_part
    WHERE review_scores_rating IS NOT NULL
)
SELECT
    review_scores_rating,
	price,
	month,
	amenity_status
FROM amenity_combinations;