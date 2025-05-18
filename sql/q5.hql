USE team1_projectdb;

DROP TABLE IF EXISTS q5_results;

WITH base AS (
  SELECT
    price,
    COALESCE(cleaning_fee, 0) AS cleaning_fee,
    price + COALESCE(cleaning_fee, 0) AS total_price,
    review_scores_rating,
    CASE WHEN COALESCE(cleaning_fee, 0) = 0 THEN 'all_in_price' ELSE 'split_cleaning_fee' END AS strategy
  FROM records_part
  WHERE review_scores_rating IS NOT NULL
),
bucketed AS (
  SELECT
    price,
    cleaning_fee,
    total_price,
    review_scores_rating,
    strategy,
    ntile(20) OVER (ORDER BY total_price) AS bucket_num
  FROM base
)
INSERT OVERWRITE LOCAL DIRECTORY '/outputs/q5'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
SELECT
  bucket_num,
  ROUND(MIN(total_price), 2) AS bucket_min_price,
  ROUND(MAX(total_price), 2) AS bucket_max_price,
  strategy,
  COUNT(*) AS count_listings,
  ROUND(AVG(review_scores_rating), 2) AS avg_rating
FROM bucketed
GROUP BY bucket_num, strategy
ORDER BY bucket_num, strategy;
