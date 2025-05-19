#!/bin/bash

echo "Start data loading"
sh ./scripts/load_data.sh

echo "Start installing dependencies"
python3.11 -m pip install -r requirements.txt

echo "Start building and cleaning data"
python3.11 ./scripts/build_data.py

echo "Start building psql"
python3.11 ./scripts/build_projectdb.py

echo "Send data to hdfs"
sh ./scripts/send_to_hdfs.sh