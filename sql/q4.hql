-- q4 Show a bar graph showing the number of failure vs non-failure timestamps

USE team3_projectdb;
SET hive.execution.engine=tez;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS q4_results; 
CREATE EXTERNAL TABLE q4_results(
    status STRING,
    count INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q4'; 

INSERT INTO q4_results
SELECT 
    CASE 
        WHEN in_failure_period = 1 THEN 'failure'
        ELSE 'non-failure'
    END AS status,
    COUNT(*) AS count
FROM 
    (
        SELECT 
            unix_timestamp(r.`timestamp`) * 1000 AS `timestamp`,
            CASE 
                WHEN f.start_time IS NOT NULL AND f.end_time IS NOT NULL THEN 1
                ELSE 0
            END AS in_failure_period
        FROM 
            sensor_readings_part_buck r
        LEFT JOIN 
            apu_failures f
        ON 
            (unix_timestamp(r.`timestamp`) * 1000) BETWEEN f.start_time AND f.end_time
    ) AS derived_table
GROUP BY 
    in_failure_period;

INSERT OVERWRITE DIRECTORY 'project/output/q4' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 

SELECT  *
FROM    q4_results
LIMIT   10;
