#!/bin/bash

hdfs dfs -rm -r project/warehouse/avsc
hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc

password=$(head -n 1 secrets/.hive.pass)

echo "Creating Hive Tables ..."
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null

echo "Creating an external table for partitioning and bucketing ..."
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/partitioning.hql > output/hive_results_part_buck.txt 2> /dev/null


# EDA Part
# clearing already created files
hdfs dfs -rm -r "project/output/q1"
hdfs dfs -rm -r "project/hive/warehouse/q1/*"
rm output/q1.csv

hdfs dfs -rm -r "project/output/q2"
hdfs dfs -rm -r "project/hive/warehouse/q2/*"
rm output/q2.csv

hdfs dfs -rm -r "project/output/q4"
hdfs dfs -rm -r "project/hive/warehouse/q4/*"
rm output/q4.csv

hdfs dfs -rm -r "project/output/q5"
hdfs dfs -rm -r "project/hive/warehouse/q5/*"
rm output/q5.csv

password=$(head -n 1 secrets/.hive.pass)

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/q1.hql
hdfs dfs -cat project/output/q1/* >> output/q1.csv
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/q2.hql
hdfs dfs -cat project/output/q2/* >> output/q2.csv
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/q4.hql
hdfs dfs -cat project/output/q4/* >> output/q4.csv
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team3 -p $password -f sql/q5.hql
hdfs dfs -cat project/output/q5/* >> output/q5.csv
