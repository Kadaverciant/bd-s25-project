USE team1_projectdb;

DROP TABLE IF EXISTS q3_results;

CREATE TABLE q3_results AS
WITH verification_combinations AS (
    SELECT
        review_scores_rating,
		    price,
        CASE
            WHEN host_has_profile_pic AND host_identity_verified  AND host_is_superhost
                THEN 'fully_featured'
            WHEN host_has_profile_pic  AND host_is_superhost
                THEN 'picture_superhost'
            WHEN host_has_profile_pic AND host_identity_verified
                THEN 'picture_verified'
            WHEN host_identity_verified  AND host_is_superhost
                THEN 'verified_superhost'
            WHEN host_has_profile_pic
                THEN 'picture_only'
            WHEN host_identity_verified
                THEN 'verified_only'
            WHEN host_is_superhost
                THEN 'superhost_only'
            ELSE 'unverified'
        END AS verification_status
    FROM records_part
    WHERE review_scores_rating IS NOT NULL
)
SELECT
    review_scores_rating,
    verification_status,
	  price
FROM verification_combinations;
