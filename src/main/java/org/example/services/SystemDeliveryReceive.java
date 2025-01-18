package org.example.services;

import org.example.data.base.DataBase;
import org.example.model.StocBilete;
import org.example.model.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public void sendNewUser(String nume, String prenume, String cnp, String email, String telefon, String tip_ticket) throws SQLException {
//        System.out.println(generareTicket());
        this.user = new User(nume, prenume, cnp, email, telefon, generareTicket(), tip_ticket);
        dataBase.insertNewClient(this.user);

    }
    public boolean cnpFind(String cnp) throws SQLException{
        if (dataBase.checkCnp(cnp)){
            return true;
        }
        return false;
    }
    
    public List<StocBilete> getStocuriBilete(){
        return dataBase.getStocBilete();
    }

    public void runScriptPython(){
        List<String> command = new ArrayList<>();
        try {
            command.add("D:\\java-projects\\ticketing\\bonuri\\.venv\\Scripts\\python.exe");
            command.add("D:\\java-projects\\ticketing\\bonuri\\main.py");
            //build process
            ProcessBuilder processBuilder = new ProcessBuilder(command);

            processBuilder.directory(new java.io.File("D:\\java-projects\\ticketing\\bonuri"));

            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println(exitCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        SystemDeliveryReceive systemDeliveryReceive = new SystemDeliveryReceive();
//        System.out.println(systemDeliveryReceive.sendNewUser());
//        for (StocBilete stoc: systemDeliveryReceive.getStocuriBilete()){
//            System.out.println(stoc.getTip_ticket());
//        }
//    }
}
