#!/bin/bash

echo "Downloading the dataset ..."
url="https://archive.ics.uci.edu/static/public/791/metropt+3+dataset.zip"

wget "$url" -O data/data.zip

unzip -o data/data.zip -d data/

rm data/data.zip
mv "data/MetroPT3(AirCompressor).csv" data/MetroPT3.csv

python3 scripts/dataset_splitter.py
echo "Removing the original dataset file ..."
rm data/MetroPT3.csv

python3 scripts/save_apu_failures.py

echo "Writing data to postgres ..."
python3 scripts/build_projectdb.py

password=$(head -n 1 secrets/.psql.pass)
echo "Listing all tables ..."
sqoop list-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team3_projectdb --username team3 --password $password

echo "Copying data from postgres to HDFS ..."
# Delete directories in case they already exist
hdfs dfs -rm -r '/user/team3/project/warehouse/*'
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team3_projectdb --username team3 --password $password --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1

