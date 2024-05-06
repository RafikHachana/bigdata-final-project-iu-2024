#!/bin/bash


#url="https://archive.ics.uci.edu/static/public/791/metropt+3+dataset.zip"

#wget "$url" -O data/data.zip

#unzip data/data.zip -d data/

# rm data/data.zip
# mv "data/MetroPT3(AirCompressor).csv" data/MetroPT3.csv

# cd data-preprocessing && python3 dataset_splitter.py
echo "Removing the original dataset file ..."
rm data/MetroPT3.csv

