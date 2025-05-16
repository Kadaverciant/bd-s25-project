password=$(head -n 1 secrets/.psql.pass)

$PROJECT_FOLDER="/user/team1/project"
$WAREHOUSE_FOLDER="$PROJECT_FOLDER/warehouse"

# Check if the folder exists
hdfs dfs -test -d "$PROJECT_FOLDER"

# Check the exit status of the previous command
if [ $? -eq 0 ]; then
    echo "Project folder $PROJECT_FOLDER exists in HDFS. Start cleaning."
    hdfs dfs -rm -rf "$PROJECT_FOLDER"
    echo "Cleaned"
else
    echo "Folder $PROJECT_FOLDER does not exist in HDFS"
fi

echo "Creating project folder: $PROJECT_FOLDER"
hdfs dfs -mkdir -p "$PROJECT_FOLDER"

hdfs dfs -chmod -R 755 "$PROJECT_FOLDER"

echo "Creating warehouse folder: $WAREHOUSE_FOLDER"
hdfs dfs -mkdir -p "$WAREHOUSE_FOLDER"
