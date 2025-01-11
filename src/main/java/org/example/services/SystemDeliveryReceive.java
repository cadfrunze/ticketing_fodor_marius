package org.example.services;

import org.example.data.base.DataBase;
import org.example.model.StocBilete;
import org.example.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class SystemDeliveryReceive {
    private final DataBase dataBase;
    private User user;
    private static final String ALFABET = "QWERTYUIOPASDFGHJKLZXCVBNM";


    public SystemDeliveryReceive() throws SQLException, ClassNotFoundException {
        this.dataBase = new DataBase();
    }
    String generareTicket(){

        StringBuilder finalTicket = new StringBuilder();

        Random randomStart = new Random();
        int num = randomStart.nextInt(0, 2);

        if (num == 0)
        {
            while (true)
            {
                num = randomStart.nextInt(10);
                finalTicket.append(num);
                if (finalTicket.length() == 11) { break; }
                else if (finalTicket.length() == 3)
                {
                    finalTicket.append("-");
                }
                num = randomStart.nextInt(ALFABET.length());
                finalTicket.append(ALFABET.charAt(num));
                if (finalTicket.length() == 7)
                {
                    finalTicket.append("-");
                }
            }

        }
        else
        {
            while (true)
            {
                num = randomStart.nextInt(ALFABET.length());
                finalTicket.append(ALFABET.charAt(num));

                if (finalTicket.length() == 11) { break; }
                else if (finalTicket.length() == 3)
                {
                    finalTicket.append("-");
                }
                num = randomStart.nextInt(10);
                finalTicket.append(num);
                if (finalTicket.length() == 7)
                {
                    finalTicket.append("-");
                }
            }
        }
        return finalTicket.toString();
    }
    public boolean sendNewUser() throws SQLException {
//        System.out.println(generareTicket());
        this.user = new User("fodor", "marius", "123456", "test@test.ro", "0743", generareTicket(), "mid");
        if (dataBase.checkCnp(user.get_cnp())){
            dataBase.insertNewClient(user);
            return true;
        }
        return false;

    }
    public List<StocBilete> getStocuriBilete(){
        return dataBase.getStocBilete();
    }

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        SystemDeliveryReceive systemDeliveryReceive = new SystemDeliveryReceive();
//        System.out.println(systemDeliveryReceive.sendNewUser());
//        for (StocBilete stoc: systemDeliveryReceive.getStocuriBilete()){
//            System.out.println(stoc.getTip_ticket());
//        }
//    }
}
