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

        

# build connection string
conn_string="host=hadoop-04.uni.innopolis.ru port=5432 user=team3 dbname=team3_projectdb password={}".format(password)


# Connect to the remote dbms
with psql.connect(conn_string) as conn:
	# Create a cursor for executing psql commands
	cur = conn.cursor()
	# Read the commands from the file and execute them.
	with open(os.path.join("sql","create_tables.sql"), mode='r', encoding='UTF-8') as file:
		content = file.read()
		cur.execute(content)
	conn.commit()

	# Read the commands from the file and execute them.
	with open(os.path.join("sql", "import_data.sql"), mode='r', encoding='UTF-8') as file:
		command= file.read()
		print(command)
		for file_path in glob.glob('data/*.csv'):
			with open(file_path, "r", encoding='UTF-8') as data:
					cur.copy_expert(command, data)

	conn.commit()

	pprint(conn)
	cur = conn.cursor()
	# Read the sql commands from the file
	with open(os.path.join("sql", "test_database.sql"), mode='r', encoding='UTF-8') as file:
		command = file.read()
		print(command)
		cur.execute(command)
		# Read all records and print them                        
		pprint(cur.fetchall())

