/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.sql.SQLException;
import org.example.services.SystemDeliveryReceive;
import org.example.ui.TicketsSystemManagement;

/**
 *
 * @author cadfrunze
 */
public class MainApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        SystemDeliveryReceive sdr = new SystemDeliveryReceive();
        TicketsSystemManagement frame = new TicketsSystemManagement(sdr);
        frame.setVisible(true);
    }
    
    
}
