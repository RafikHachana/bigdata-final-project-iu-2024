#!/bin/bash

echo "Downloading the dataset ..."
url="https://archive.ics.uci.edu/static/public/791/metropt+3+dataset.zip"

wget "$url" -O data/data.zip

unzip data/data.zip -d data/

rm data/data.zip
mv "data/MetroPT3(AirCompressor).csv" data/MetroPT3.csv

cd scripts && python3 dataset_splitter.py
echo "Removing the original dataset file ..."
rm data/MetroPT3.csv


echo "Writing data to postgres ..."
python3 scripts/build_projectdb.py

password=$(head -n 1 secrets/.psql.pass)
echo "Checking all databases ..."
sqoop list-databases --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team3_projectdb --username team3 --password $password
echo "Listing all tables ..."
sqoop list-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team3_projectdb --username team3 --password $password

echo "Copying data from postgres to HDFS ..."
if [ -d "/home/team3/project/warehouse" ]; then rm -Rf "/home/team3/project/warehouse"; fi
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team3_projectdb --username team3 --password $password --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1

