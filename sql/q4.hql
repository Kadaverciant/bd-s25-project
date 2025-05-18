USE team1_projectdb;

DROP TABLE IF EXISTS q4_results;

CREATE TABLE q4_results AS
SELECT
  month,
  property_type,
  ROUND(MIN(price), 2) AS min_price,
  ROUND(AVG(price), 2) AS avg_price,
  ROUND(MAX(price), 2) AS max_price
FROM records_part
WHERE price IS NOT NULL
GROUP BY month, property_type
ORDER BY month, property_type;

SELECT * FROM q4_results;
