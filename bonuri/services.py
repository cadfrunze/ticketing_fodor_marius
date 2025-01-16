import mysql.connector
from mysql.connector import Error
from data import *


def client() -> dict:
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
            # cursor.execute("SELECT DATABASE()")
            # record = cursor.fetchone()
            # print(f"Baza de date: {record[0]}")
            cursor.execute("SELECT * FROM evidenta_clienti")
            data_evidenta_clienti = cursor.fetchall()[-1]
            index: int = int("".join([x for x in str(data_evidenta_clienti[0]) if x.isdigit()]))
            cursor.execute(f"SELECT * from stoc_bilete_cumparate where fk_idevidenta_clienti = {index}")
            data_stocbilete = cursor.fetchall()
            cursor.close()
            connection.close()
    except Exception as e:
        print(e)
    else:
        utilizator: dict = dict()
        utilizator['nume'] = data_evidenta_clienti[1].capitalize()
        if "\t" in data_evidenta_clienti[2]:
            utilizator['prenume'] = data_evidenta_clienti[2].capitalize().replace("\t", "")
        else:
            utilizator['prenume'] = data_evidenta_clienti[2].capitalize()
        utilizator['cnp'] = data_evidenta_clienti[3]
        utilizator['email'] = data_evidenta_clienti[4]
        if len(data_evidenta_clienti[-1]) > 1:
            utilizator['telefon'] = data_evidenta_clienti[-1]
        utilizator['tip_ticket'] = data_stocbilete[0][3]
        utilizator['serie_ticket'] = data_stocbilete[0][4]
        return utilizator


