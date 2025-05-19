USE team1_projectdb;

DROP TABLE IF EXISTS q1_results;

CREATE TABLE q1_results AS
WITH popular_neighbourhoods AS (
    SELECT neighbourhood
    FROM records_part
    WHERE neighbourhood IS NOT NULL
    GROUP BY neighbourhood
    ORDER BY COUNT(*) DESC
    LIMIT 10
)
SELECT
    r.neighbourhood,
    r.price,
    r.review_scores_rating
FROM records_part r
JOIN popular_neighbourhoods p ON r.neighbourhood = p.neighbourhood
WHERE r.price IS NOT NULL;