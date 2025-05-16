#!/bin/bash

password=$(head -n 1 secrets/.psql.pass)

rm -rf outputs
mkdir -p outputs

PROJECT_FOLDER="/user/team1/project"
WAREHOUSE_FOLDER="$PROJECT_FOLDER/warehouse"

# Check if the folder exists
hdfs dfs -test -d "$PROJECT_FOLDER"

# Check the exit status of the previous command
if [ $? -eq 0 ]; then
    echo "Project folder $PROJECT_FOLDER exists in HDFS. Start cleaning."
    hdfs dfs -rm -r -f "$PROJECT_FOLDER"
    echo "Cleaned"
else
    echo "Folder $PROJECT_FOLDER does not exist in HDFS"
fi

echo "Creating project folder: $PROJECT_FOLDER"

hdfs dfs -mkdir -p "$PROJECT_FOLDER"
hdfs dfs -chmod -R 755 "$PROJECT_FOLDER"

echo "Creating warehouse folder: $WAREHOUSE_FOLDER"

hdfs dfs -mkdir -p "$WAREHOUSE_FOLDER"
hdfs dfs -chmod 755 "$WAREHOUSE_FOLDER"

echo "Folder structure created successfully"

show_hdfs_size() {
    local folder=$1
    echo -n "Size of $folder: "
    hdfs dfs -du -s -h "$folder" | awk '{print $1$2}'
}

start_time=$(date +%s)

echo "Start loading"
sqoop import \
  --connect "jdbc:postgresql://hadoop-04.uni.innopolis.ru/team1_projectdb" \
  --username team1\
  --password "$password" \
  --compression-codec=bzip2 \
  --compress \
  --as-avrodatafile \
  --warehouse-dir=$WAREHOUSE_FOLDER \
  --m 1 \
  --outdir "$(pwd)/outputs" \
  --table records

end_time=$(date +%s)
execution_time=$((end_time - start_time))

hdfs dfs -mkdir -p "$WAREHOUSE_FOLDER/avsc"
hdfs dfs -put -f outputs/*.avsc "$WAREHOUSE_FOLDER/avsc"

echo "Sqoop import completed in $execution_time seconds"
show_hdfs_size "$WAREHOUSE_FOLDER"

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team1 -p $password -f sql/craete_tables.hql