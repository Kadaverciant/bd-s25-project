USE team1_projectdb;

DROP TABLE IF EXISTS q5_results;

CREATE TABLE q5_results AS
SELECT
    review_scores_rating,
    host_response_time,
    CASE
        WHEN price < 100 THEN '0-99'
        WHEN price < 500 THEN '100-499'
        WHEN price < 1000 THEN '500-999'
        WHEN price < 2000 THEN '1000-1999'
        ELSE '2000+'
    END AS price_bucket,
    CASE
        WHEN host_response_rate < 25 THEN '0-24'
        WHEN host_response_rate < 50 THEN '25-49'
        WHEN host_response_rate < 75 THEN '50-74'
        ELSE '75-100'
    END AS host_response_rate_bucket
FROM records_part
WHERE
    review_scores_rating IS NOT NULL OR
    host_response_time IS NOT NULL OR
    price IS NOT NULL OR
    host_response_rate IS NOT NULL;
