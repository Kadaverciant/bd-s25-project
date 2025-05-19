USE team1_projectdb;

DROP TABLE IF EXISTS q6_results;

CREATE TABLE q6_results AS
SELECT
  latitude,
  longitude,
  price,
  review_scores_rating
FROM records_part;
