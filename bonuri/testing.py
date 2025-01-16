import mysql.connector
from mysql.connector import Error
from data import *

try:
    connection = mysql.connector.connect(
        host="localhost",
        port="3306",
        user=USER,
        password=PASS,
        database="spectacol"
    )
    if connection.is_connected():
        cursor = connection.cursor()
        cursor.execute("SELECT DATABASE()")
        record = cursor.fetchone()
        print(f"Baza de date: {record[0]}")


except Error as e:
    raise e

else:
    if connection.is_connected():
        cursor.close()
        connection.close()