USE team1_projectdb;

DROP TABLE IF EXISTS q5_results;

CREATE TABLE q5_results AS
SELECT
review_scores_rating, host_response_rate, host_response_time,
CASE
    WHEN price < 100 THEN '0-99'
    WHEN price BETWEEN 100 AND 499 THEN '100-499'
    WHEN price BETWEEN 500 AND 999 THEN '500-999'
    WHEN price BETWEEN 1000 AND 1999 THEN '1000-1999'
    ELSE '2000+'
END AS price_bucket
FROM records_part;
