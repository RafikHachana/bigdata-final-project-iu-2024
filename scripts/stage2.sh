#!/bin/bash

hdfs dfs -rm -r project/warehouse/avsc
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc

password=$(head -n 1 secrets/.hive.pass)

echo "Creating Hive Tables ..."
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null

echo "Creating an external table for partitioning and bucketing ..."
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/partitioning.hql > output/hive_results_part_buck.txt 2> /dev/null
