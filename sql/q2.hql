USE team1_projectdb;

DROP TABLE IF EXISTS q2_results;

CREATE TABLE q2_results AS
SELECT
    LEAST(maximum_nights, 30) as maximum_nights,
	LEAST(minimum_nights, 30) as minimum_nights,
    cancellation_policy,
    review_scores_rating,
    price,
    CASE
        WHEN price < 100 THEN '0-99'
        WHEN price < 500 THEN '100-499'
        WHEN price < 1000 THEN '500-999'
        WHEN price < 2000 THEN '1000-1999'
        ELSE '2000+'
    END AS price_bucket
FROM records_part
WHERE review_scores_rating IS NOT NULL;
