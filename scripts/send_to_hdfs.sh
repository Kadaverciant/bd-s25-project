password=$(head -n 1 secrets/.psql.pass)

HDFS_PATH="/user/team1/project"

# Check if the folder exists
hdfs dfs -test -d "$HDFS_PATH"

# Check the exit status of the previous command
if [ $? -eq 0 ]; then
    echo "Folder $HDFS_PATH exists in HDFS"
else
    echo "Folder $HDFS_PATH does not exist in HDFS"
fi
