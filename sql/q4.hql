USE team1_projectdb;

DROP TABLE IF EXISTS q4_results;

CREATE TABLE q4_results AS
with popular as (
    select property_type, count(*) as count
    from records_part
    where property_type IS NOT NULL
    group by property_type
    order by count desc
    limit 25
)
SELECT
  month,
  property_type,
  price,
  review_scores_rating
FROM records_part as r
WHERE price IS NOT NULL AND r.property_type in (select p.property_type from popular as p);
