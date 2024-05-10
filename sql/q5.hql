-- q5 the query will be used to show the distribution of the time interval between two consecutive samples in the data

USE team3_projectdb;
SET hive.execution.engine=tez;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS q5_results; 
CREATE EXTERNAL TABLE q5_results(
    `index` INT,
    sampling_diff INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q5'; 

INSERT INTO q5_results
SELECT `index`, unix_timestamp(`timestamp`) - LAG(unix_timestamp(`timestamp`)) OVER (ORDER BY `timestamp`) AS sampling_diff
FROM sensor_readings_part_buck
WHERE month(TO_DATE(`timestamp`)) = 4;

INSERT OVERWRITE DIRECTORY 'project/output/q5' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * 
FROM q5_results;

SELECT  *
FROM    q5_results
LIMIT   10;



