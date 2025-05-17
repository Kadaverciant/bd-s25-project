USE team1_projectdb;

SELECT
    r.neighbourhood,
    ROUND(AVG(r.price), 2) AS avg_price,
    ROUND(PERCENTILE(CAST(r.price AS DOUBLE), 0.5), 2) AS median_price,
    ROUND(STDDEV(r.price), 2) AS price_stddev,
    MIN(r.price) AS min_price,
    MAX(r.price) AS max_price,
    ROUND(AVG(r.review_scores_rating), 2) AS avg_rating,
    ROUND(AVG(CASE WHEN r.host_is_superhost THEN 1.0 ELSE 0.0 END) * 100, 2) AS superhost_percentage,
    ROUND(AVG(CASE WHEN r.room_type = 'Entire home/apt' THEN 1.0 ELSE 0.0 END) * 100, 2) AS entire_home_ratio,
    COUNT(*) AS listings_count
FROM
    records_part r
WHERE
    r.month IN ('september', 'october', 'november', 'december', 'january', 'february', 'march', 'april', 'may')
    AND r.price > 10
    AND r.price IS NOT NULL
    AND r.neighbourhood IS NOT NULL
GROUP BY
    r.neighbourhood
HAVING
    AVG(r.review_scores_rating) >= 80
ORDER BY
    avg_price DESC
LIMIT 20;