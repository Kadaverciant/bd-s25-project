USE team1_projectdb;


SELECT
  total,
  CASE WHEN cleaning_fee = 0 THEN 'all_in_price' ELSE 'split' END AS strat,
  ROUND(AVG(review_scores_rating), 2) AS avg_rating,
  COUNT(*) AS cnt
FROM (
  SELECT
    price,
    cleaning_fee,
    price + COALESCE(cleaning_fee, 0) AS total,
    review_scores_rating
  FROM records_part
  WHERE review_scores_rating IS NOT NULL
) t
WHERE total BETWEEN 500 AND 1500 -- диапазон итоговой цены
GROUP BY total, strat
ORDER BY total, strat;
