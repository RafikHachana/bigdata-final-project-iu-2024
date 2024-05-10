-- q1 Show the distribution of failure events with their period in a normal line graph. 

USE team3_projectdb;
SET hive.execution.engine=tez;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS q1_results; 
CREATE EXTERNAL TABLE q1_results(
    `index` INT,
    `timestamp` STRING,
    in_failure_period INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q1'; 

INSERT INTO q1_results
SELECT `index`, unix_timestamp(r.`timestamp`) * 1000 AS `timestamp`,
    CASE 
        WHEN f.start_time IS NOT NULL AND f.end_time IS NOT NULL THEN 1
        ELSE 0
    END AS in_failure_period
FROM 
(SELECT * FROM sensor_readings_part_buck WHERE index % 1000 = 0) r
LEFT JOIN apu_failures f
ON 
    (unix_timestamp(r.`timestamp`) * 1000) BETWEEN f.start_time AND f.end_time
SORT BY `index`;

INSERT OVERWRITE DIRECTORY 'project/output/q1' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q1_results;

SELECT *
FROM q1_results
LIMIT 10;


