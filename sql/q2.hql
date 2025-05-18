USE team1_projectdb;

DROP TABLE IF EXISTS q2_results;

CREATE TABLE q2_results AS
WITH amenities_stats AS (
    SELECT
        r.room_type,
        ROUND(AVG(r.price), 2) AS avg_price,
        ROUND(PERCENTILE(CAST(r.price AS BIGINT), 0.5), 2) AS median_price,
        ROUND(AVG(CASE WHEN r.air_conditioning THEN 1 ELSE 0 END) * 100, 1) AS air_cond_pct,
        ROUND(AVG(CASE WHEN r.wifi THEN 1 ELSE 0 END) * 100, 1) AS wifi_pct,
        ROUND(AVG(CASE WHEN r.refrigerator THEN 1 ELSE 0 END) * 100, 1) AS fridge_pct,
        ROUND(AVG(CASE WHEN r.hot_water THEN 1 ELSE 0 END) * 100, 1) AS hot_water_pct,
        ROUND(AVG(CASE WHEN r.essentials THEN 1 ELSE 0 END) * 100, 1) AS essentials_pct,
        ROUND(AVG(CASE WHEN r.washer THEN 1 ELSE 0 END) * 100, 1) AS washer_pct,
        ROUND(AVG(r.bathrooms), 1) AS avg_bathrooms,
        ROUND(AVG(r.bedrooms), 1) AS avg_bedrooms,
        COUNT(*) AS listings_count
    FROM records_part r
    WHERE r.month IN ('september', 'october', 'november', 'december', 'january', 'february', 'march', 'april', 'may')
      AND r.price BETWEEN 10 AND 10000
    GROUP BY r.room_type
)
SELECT *,
       (air_cond_pct + wifi_pct + fridge_pct + washer_pct) / 4 AS avg_premium_amenities_score
FROM amenities_stats
ORDER BY avg_price DESC;
