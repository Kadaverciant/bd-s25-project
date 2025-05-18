USE team1_projectdb;

DROP TABLE IF EXISTS q5_results;

CREATE TABLE q5_results AS
SELECT price, price+cleaning_fee as total_price, review_scores_rating, cleaning_fee > 0 as has_cleaning_fee from records_part;
