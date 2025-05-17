USE team1_projectdb;

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
GROUP BY
  host_has_profile_pic,
  host_is_superhost,
  host_identity_verified
ORDER BY avg_rating DESC;
