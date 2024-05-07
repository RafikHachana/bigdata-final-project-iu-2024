SET hive.execution.engine=tez;

DROP DATABASE IF EXISTS team3_projectdb CASCADE;


CREATE DATABASE team3_projectdb LOCATION "project/hive/warehouse";
USE team3_projectdb;

-- Create tables

-- sensor_readings table
CREATE EXTERNAL TABLE sensor_readings STORED AS AVRO LOCATION 'project/warehouse/sensor_readings' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/sensor_readings.avsc');


-- apu_failures table
CREATE EXTERNAL TABLE apu_failures STORED AS AVRO LOCATION 'project/warehouse/apu_failures' TBLPROPERTIES ('avro.schema.url'='project/warehouse/avsc/apu_failures.avsc');


SELECT * FROM sensor_readings LIMIT 10;
SELECT * FROM apu_failures LIMIT 10;
