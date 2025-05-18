USE team1_projectdb;

DROP TABLE IF EXISTS q1_results;

CREATE TABLE q1_results AS
with popular as (
    select neighbourhood, count(*) as count
    from records_part
    where neighbourhood IS NOT NULL
    group by neighbourhood
    order by count desc
    limit 25
)
SELECT
    r.neighbourhood,
    price,
    r.review_scores_rating,
    CASE WHEN r.host_is_superhost THEN 1.0 ELSE 0.0 END as is_superhost,
    CASE WHEN r.room_type = 'Entire home/apt' THEN 1.0 ELSE 0.0 END as is_home_or_apt
FROM records_part r
WHERE
    r.price IS NOT NULL
    AND r.neighbourhood IS NOT NULL
    AND r.neighbourhood in (select p.neighbourhood from popular as p);
