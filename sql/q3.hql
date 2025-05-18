USE team1_projectdb;

DROP TABLE IF EXISTS q3_results;

CREATE TABLE q3_results AS
SELECT
  host_has_profile_pic,
  host_is_superhost,
  host_identity_verified,
  ROUND(AVG(review_scores_rating), 2) AS avg_rating,
  ROUND(AVG(price), 2) AS avg_price,
  COUNT(*) AS listings_count
FROM records_part
WHERE review_scores_rating IS NOT NULL
  AND price IS NOT NULL
  AND host_has_profile_pic IS NOT NULL
  AND host_is_superhost IS NOT NULL
  AND host_identity_verified IS NOT NULL
GROUP BY host_has_profile_pic, host_is_superhost, host_identity_verified
ORDER BY avg_rating DESC;
