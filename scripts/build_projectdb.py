import psycopg2 as psql
from pprint import pprint
import os

# Read password from secrets file
file = os.path.join("secrets", ".psql.pass")
with open(file, "r", encoding="utf-8") as file:
    password = file.read().rstrip()

# build connection string
# conn_string = "host=localhost port=5432 user=postgres dbname=team1 password={}".format(password)
conn_string = "host=hadoop-04.uni.innopolis.ru port=5432 user=team1 dbname=team1_projectdb password={}".format(
    password
)


# Connect to the remote dbms
with psql.connect(conn_string) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "create_tables.sql"), encoding="utf-8") as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql"), encoding="utf-8") as file:
        # We assume that the COPY commands in the file are ordered (1.depts, 2.emps)
        commands = file.readlines()
        with open(
            os.path.join("data", "cleaned.csv"), "r", encoding="utf-8"
        ) as records:
            cur.copy_expert(commands[0], records)

    # If the sql statements are CRUD then you need to commit the change
    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql"), encoding="utf-8") as file:
        commands = file.readlines()
        for command in commands:
            cur.execute(command)
            # Read all records and print them
            pprint(cur.fetchall())
