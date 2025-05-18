USE team1_projectdb;

DROP TABLE IF EXISTS q2_results;

CREATE TABLE q2_results AS
with popular as (
    select neighbourhood, count(*) as count
    from records_part
    where neighbourhood IS NOT NULL
    group by neighbourhood
    order by count desc
    limit 25
)
SELECT room_type, property_type, neighbourhood, price, review_scores_rating,
       ROUND((CASE WHEN r.air_conditioning THEN 1.0 ELSE 0.0 END +
       CASE WHEN r.wifi THEN 1.0 ELSE 0.0 END +
       CASE WHEN r.refrigerator THEN 1.0 ELSE 0.0 END +
       CASE WHEN r.essentials THEN 1.0 ELSE 0.0 END +
       CASE WHEN r.washer THEN 1.0 ELSE 0.0 END +
       CASE WHEN r.hot_water THEN 1.0 ELSE 0.0 END) / 6, 3) as good
FROM records_part as r
WHERE
    r.price IS NOT NULL
    AND r.neighbourhood IS NOT NULL
    AND r.neighbourhood in (select p.neighbourhood from popular as p);
