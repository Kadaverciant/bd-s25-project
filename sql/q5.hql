USE team1_projectdb;

WITH base AS (
  SELECT
    price,
    COALESCE(cleaning_fee, 0) AS cleaning_fee,
    price + COALESCE(cleaning_fee, 0) AS total_price,
    review_scores_rating,
    CASE WHEN COALESCE(cleaning_fee, 0) = 0 THEN 'all_in_price' ELSE 'split_cleaning_fee' END AS strategy
  FROM records_part
  WHERE review_scores_rating IS NOT NULL
    AND price + COALESCE(cleaning_fee, 0) BETWEEN 10 AND 10000  -- Убираем выбросы
),

limits AS (
  SELECT
    MIN(total_price) AS min_price,
    MAX(total_price) AS max_price
  FROM base
),

bucketed AS (
  SELECT
    b.*,
    l.min_price,
    l.max_price,
    CAST(FLOOR(
      20 * (total_price - l.min_price) / NULLIF(l.max_price - l.min_price, 0)
    ) AS INT) AS bucket_num
  FROM base b
  CROSS JOIN limits l
)

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
