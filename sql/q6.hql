USE team1_projectdb;

DROP TABLE IF EXISTS q6_results;

CREATE TABLE q6_results AS
WITH top_price_neighbourhoods AS (
    SELECT neighbourhood, AVG(price) AS criterion
    FROM records_part
    WHERE neighbourhood IS NOT NULL
    GROUP BY neighbourhood
    ORDER BY criterion DESC
    LIMIT 10
),
top_rating_neighbourhoods AS (
    SELECT neighbourhood, AVG(review_scores_rating) AS criterion
    FROM records_part
    WHERE neighbourhood IS NOT NULL
    GROUP BY neighbourhood
    ORDER BY criterion DESC
    LIMIT 10
)
SELECT
    r.latitude,
    r.longitude,
    r.price,
    r.review_scores_rating,
    r.neighbourhood,
    (r.neighbourhood IN (SELECT p.neighbourhood FROM top_price_neighbourhoods p)) AS in_top_price,
    (r.neighbourhood IN (SELECT rt.neighbourhood FROM top_rating_neighbourhoods rt)) AS in_top_rating
FROM records_part r;