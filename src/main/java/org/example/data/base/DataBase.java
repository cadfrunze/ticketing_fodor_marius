package org.example.data.base;
import org.example.model.User;

import java.sql.*;

public class DataBase {
    private final String DB_URL = "jdbc:mysql://" + System.getenv("urlAdress");
    private final String USER = System.getenv("userDb");
    private final String PASS = System.getenv("passDb");
    private Connection connection;

    public DataBase() throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public void testing(String nume){
        System.out.println(nume);
    }


//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        DataBase dataBase = new DataBase();
//        //System.out.println("Connection ok");
//
//    }
}
