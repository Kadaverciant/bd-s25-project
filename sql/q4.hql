USE team1_projectdb;

DROP TABLE IF EXISTS q4_results;

CREATE TABLE q4_results AS
WITH top_property AS (
    SELECT property_type
    FROM records_part
    WHERE property_type IS NOT NULL
    GROUP BY property_type
    ORDER BY COUNT(*) DESC
    LIMIT 25
),
top_property_room AS (
    SELECT
        property_type,
        room_type,
        COUNT(*) AS record_count
    FROM records_part
    WHERE property_type IS NOT NULL
      AND room_type IS NOT NULL
    GROUP BY property_type, room_type
    ORDER BY record_count DESC
    LIMIT 25
)
SELECT
    r.month,
    r.property_type,
    r.room_type,
    r.price,
    r.review_scores_rating,
    r.room_type || ' in ' || r.property_type AS property_description,
    tp.property_type IS NOT NULL AS in_top_property,
    tpr.property_type IS NOT NULL AS in_top_property_room
FROM records_part r
LEFT JOIN top_property tp
    ON r.property_type = tp.property_type
LEFT JOIN top_property_room tpr
    ON r.property_type = tpr.property_type
    AND r.room_type = tpr.room_type
WHERE r.price IS NOT NULL
  AND (tp.property_type IS NOT NULL OR tpr.property_type IS NOT NULL);
