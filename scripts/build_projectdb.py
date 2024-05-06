"""
Creates the necessary tables for the dataset in postgres and copies the data from the csv files
"""
import os
import glob
from pprint import pprint
import psycopg2 as psql


# Read password from secrets file
file = os.path.join("secrets", ".psql.pass")
with open(file, "r", encoding='UTF-8') as file:
    password=file.read().rstrip()


HOST="host=hadoop-04.uni.innopolis.ru"
# build connection string
CONN_STRING=f"{HOST} port=5432 user=team3 dbname=team3_projectdb password={password}"


# Connect to the remote dbms
with psql.connect(CONN_STRING) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql","create_tables.sql"), mode='r', encoding='UTF-8') as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql"), mode='r', encoding='UTF-8') as file:
        sensor_readings_cmd, apu_failures_cmd = file.readlines()

        # Write sensor readings
        for file_path in glob.glob('data/sensor_readings.*.csv'):
            with open(file_path, "r", encoding='UTF-8') as data:
                cur.copy_expert(sensor_readings_cmd, data)
        # Write APU failures
        with open("data/apu_failures.csv", "r", encoding='UTF-8') as data:
            cur.copy_expert(apu_failures_cmd, data)

    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql"), mode='r', encoding='UTF-8') as file:
        commands = file.readlines()
        for command in commands:
            print(command)
            cur.execute(command)
            # Read all records and print them
            pprint(cur.fetchall())
