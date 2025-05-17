USE team1_projectdb;

SELECT
    deposit_category,
    AVG(review_scores_rating) AS avg_rating,
    AVG(price) AS avg_price
FROM (
    SELECT
        CASE
            WHEN security_deposit = 0 THEN 'no_deposit'
            WHEN security_deposit <= 100 THEN 'small_deposit'
            ELSE 'large_deposit'
        END AS deposit_category,
        review_scores_rating,
        price
    FROM
        records_part
    WHERE
        security_deposit IS NOT NULL
) AS subquery
GROUP BY
    deposit_category;