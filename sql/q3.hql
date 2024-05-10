-- q3 Show column growth before an hour and after an hour of the beginning of the first event. 

USE team3_projectdb;
SET hive.execution.engine=tez;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS q3_results; 
CREATE EXTERNAL TABLE q3_results(
    `index` INT,
    `timestamp` TIMESTAMP,
    TP2 DOUBLE,
    TP3 DOUBLE,
    H1 DOUBLE,
    DV_pressure DOUBLE,
    Reservoirs DOUBLE,
    Oil_temperature DOUBLE,
    Motor_current DOUBLE,
    COMP DOUBLE,
    DV_eletric DOUBLE,
    Towers DOUBLE,
    MPG DOUBLE,
    LPS DOUBLE,
    Pressure_switch DOUBLE,
    Oil_level DOUBLE,
    Caudal_impulses DOUBLE,
    event_id INT,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    duration_minutes INT,
    severity VARCHAR(10),
    in_failure_period INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
location 'project/hive/warehouse/q3'; 

INSERT INTO q3_results
SELECT `index`, (CAST(r.`timestamp` AS TIMESTAMP)) AS `timestamp`,
TP2, TP3, H1, DV_pressure, Reservoirs, Oil_temperature, Motor_current, COMP, 
DV_eletric, Towers, MPG, LPS, Pressure_switch, Oil_level, Caudal_impulses,
event_id, start_time, end_time, duration_minutes, severity,
    CASE 
        WHEN f.start_time IS NOT NULL AND f.end_time IS NOT NULL THEN 1
        ELSE 0
    END AS in_failure_period
FROM 
-- (SELECT * FROM sensor_readings_part_buck WHERE index % 1000 = 0) r
(SELECT * FROM sensor_readings_part_buck 
WHERE CAST(unix_timestamp(`timestamp`) AS INT) > CAST(CAST("2020-04-12 11:50:00" AS TIMESTAMP) AS INT) - 3600 -- one hour before  start first event.
AND CAST(unix_timestamp(`timestamp`) AS INT) < CAST(CAST("2020-04-12 11:50:00" AS TIMESTAMP) AS INT) + 3600 -- one hour after the start first event.
) r
-- sensor_readings_part_buck r
LEFT JOIN apu_failures f
ON 
    (unix_timestamp(r.`timestamp`) * 1000) BETWEEN f.start_time AND f.end_time
SORT BY `index`;

INSERT OVERWRITE DIRECTORY 'project/output/q3' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q3_results;

SELECT *
FROM q3_results
LIMIT 10;
