package org.example.services;

import org.example.data.base.DataBase;
import org.example.model.User;

import java.sql.SQLException;

public class Delivery {
    private DataBase dataBase;
    private User user;
    public Delivery() throws SQLException, ClassNotFoundException {
        this.user = new User("marius", "marius", "123", "aaaa", "dssdds");
        this.dataBase = new DataBase();
    }

    public void send() {
        dataBase.testing(user.get_nume());

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Delivery delivery = new Delivery();
        delivery.send();
    }
}
