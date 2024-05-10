-- q2 the query will be used to show the distribution (in days) of failures overtime

USE team3_projectdb;
SET hive.execution.engine=tez;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS q2_results; 
CREATE EXTERNAL TABLE q2_results(
    `event_day` DATE,
    duration_minutes INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q2'; 

INSERT INTO q2_results
SELECT 
    CAST(CAST((start_time/1000 + 60) AS timestamp) as DATE) AS event_day,
    duration_minutes
FROM 
    apu_failures;

INSERT OVERWRITE DIRECTORY 'project/output/q2' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ','
SELECT * FROM q2_results;

SELECT  *
FROM    q2_results
LIMIT   10;
