USE team1_projectdb;

DROP TABLE IF EXISTS q3_results;

CREATE TABLE q3_results AS
SELECT
  host_has_profile_pic,
  host_identity_verified,
  review_scores_rating,
  price
FROM records_part
WHERE review_scores_rating IS NOT NULL
  AND price IS NOT NULL
  AND host_has_profile_pic IS NOT NULL
  AND host_identity_verified IS NOT NULL;
