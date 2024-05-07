USE team3_projectdb;

SET hive.exec.dynamic.partition=true;
SET hive.execution.engine=tez;
SET hive.exec.dynamic.partition.mode=nonstrict;



CREATE EXTERNAL TABLE sensor_readings_part_buck(
    index INT,
    `timestamp` STRING,
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
    Caudal_impulses DOUBLE
)
PARTITIONED BY (timestamp_month STRING)
CLUSTERED BY (index) into 7 buckets
STORED AS AVRO LOCATION '/user/team3/project/warehouse/sensor_readings_part_buck'
TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');

INSERT INTO TABLE sensor_readings_part_buck PARTITION (timestamp_month)
SELECT *, month(TO_DATE(`timestamp`)) as timestamp_month
FROM sensor_readings;

SELECT * FROM sensor_readings_part_buck LIMIT 10;

DROP TABLE sensor_readings;
