USE team1_projectdb;

SELECT month,
       ROUND(AVG(price), 2) AS avg_price
FROM records_part
GROUP BY month
ORDER BY avg_price DESC;
