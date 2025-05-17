USE team1_projectdb;

SELECT
    CASE
        WHEN security_deposit = 0 THEN 'no_deposit'
        WHEN security_deposit <= 100 THEN 'small_deposit'
        ELSE 'large_deposit'
    END AS deposit_type,
    AVG(review_scores_rating) AS avg_rating,
    AVG(price) AS avg_price
FROM
    records_part
WHERE
    security_deposit IS NOT NULL
GROUP BY
    deposit_type;