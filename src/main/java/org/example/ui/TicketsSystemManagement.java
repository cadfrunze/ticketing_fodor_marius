/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.services.SystemDeliveryReceive;



/**
 *
 * @author cadfrunze
 */
public class TicketsSystemManagement extends javax.swing.JFrame {

    /**
     * Creates new form TicketsSystemManagement
     */
    private SystemDeliveryReceive sdr;
    public TicketsSystemManagement() throws SQLException, ClassNotFoundException {
        sdr = new SystemDeliveryReceive();
        initComponents();
    }
    
    public TicketsSystemManagement(SystemDeliveryReceive sdr) throws SQLException, ClassNotFoundException{
        this.sdr = sdr;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        JPanelDate = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tab1TfPrenume = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tab1TfCnp = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        tab1TfTelefon = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        tab1TfNume = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tab1TfEmail = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tab1LbAv = new javax.swing.JLabel();
        jPanelBilete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 650));
        setResizable(false);

        jLabel1.setText("Powered by CadFrunze");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("CNP");
        jLabel4.setAlignmentY(2.0F);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefon");
        jLabel6.setAlignmentY(2.0F);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Prenume");
        jLabel3.setAlignmentY(2.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nume");
        jLabel2.setAlignmentY(2.0F);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jLabel5.setAlignmentY(2.0F);

        tab1TfPrenume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tab1TfPrenumeFocusLost(evt);
            }
        });
        tab1TfPrenume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab1TfPrenumeKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(tab1TfPrenume);
        tab1TfPrenume.getAccessibleContext().setAccessibleParent(JPanelDate);

        tab1TfCnp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tab1TfCnpFocusLost(evt);
            }
        });
        tab1TfCnp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tab1TfCnpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab1TfCnpKeyTyped(evt);
            }
        });
        jScrollPane8.setViewportView(tab1TfCnp);
        tab1TfCnp.getAccessibleContext().setAccessibleParent(JPanelDate);

        jScrollPane9.setViewportView(tab1TfTelefon);
        tab1TfTelefon.getAccessibleContext().setAccessibleParent(JPanelDate);

        tab1TfNume.setToolTipText("");
        tab1TfNume.setMaximumSize(new java.awt.Dimension(62, 20));
        tab1TfNume.setName(""); // NOI18N
        tab1TfNume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tab1TfNumeFocusLost(evt);
            }
        });
        tab1TfNume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab1TfNumeKeyTyped(evt);
            }
        });
        jScrollPane10.setViewportView(tab1TfNume);
        tab1TfNume.getAccessibleContext().setAccessibleParent(JPanelDate);

        tab1TfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tab1TfEmailFocusLost(evt);
            }
        });
        tab1TfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab1TfEmailKeyTyped(evt);
            }
        });
        jScrollPane11.setViewportView(tab1TfEmail);
        tab1TfEmail.getAccessibleContext().setAccessibleParent(JPanelDate);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        tab1LbAv.setForeground(new java.awt.Color(255, 0, 51));
        tab1LbAv.setToolTipText("");

        javax.swing.GroupLayout JPanelDateLayout = new javax.swing.GroupLayout(JPanelDate);
        JPanelDate.setLayout(JPanelDateLayout);
        JPanelDateLayout.setHorizontalGroup(
            JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDateLayout.createSequentialGroup()
                        .addComponent(tab1LbAv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(JPanelDateLayout.createSequentialGroup()
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane11)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 65, Short.MAX_VALUE))))
        );
        JPanelDateLayout.setVerticalGroup(
            JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDateLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanelDateLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(40, 40, 40))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDateLayout.createSequentialGroup()
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelDateLayout.createSequentialGroup()
                                .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JPanelDateLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelDateLayout.createSequentialGroup()
                                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(JPanelDateLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addComponent(jScrollPane10))
                                        .addGap(24, 24, 24)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelDateLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(JPanelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab1LbAv, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanelBilete.setVisible(false);
        jPanelBilete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Da!");

        javax.swing.GroupLayout jPanelBileteLayout = new javax.swing.GroupLayout(jPanelBilete);
        jPanelBilete.setLayout(jPanelBileteLayout);
        jPanelBileteLayout.setHorizontalGroup(
            jPanelBileteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBileteLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanelBileteLayout.setVerticalGroup(
            jPanelBileteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBileteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBilete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBilete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(JPanelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );

        jTabbedPane1.addTab("Buy Ticket", tab1);
        tab1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Edit/Activate", tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //EVENTURI
    void checkFielduri(){
        
            try {
            // TODO add your handling code here:
            this.sdr.cnpFind(tab1TfCnp.getText().strip());
            tab1LbAv.setText("");
            if (false == this.sdr.cnpFind(tab1TfCnp.getText().strip()))
            {
                if (tab1TfNume.getText().strip().length() < 3
                    || tab1TfPrenume.getText().strip().length() < 3
                    || tab1TfCnp.getText().strip().length() < 3
                    || tab1TfEmail.getText().strip().length() < 3
                    )
                    {
                        jPanelBilete.setVisible(false);
                        tab1LbAv.setText("Completeaza toate campurile cu * (minim 3 car.)");
                        
                    }
                else {
                    jPanelBilete.setVisible(true);
                    tab1LbAv.setText("");
                    }
            }
            else {
                jPanelBilete.setVisible(false);
                
                tab1LbAv.setText(String.format("Acest cnp: (%s) exista in baza de date!", tab1TfCnp.getText().strip()));
                }
        } catch (SQLException ex) {
            Logger.getLogger(TicketsSystemManagement.class.getName()).log(Level.SEVERE, null, ex);
            jPanelBilete.setVisible(false);
        }
        
    }
    
    
    
    
    private void tab1TfCnpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tab1TfCnpFocusLost
        //System.out.println(tab1TfCnp.getText().toString());
        checkFielduri();
    }//GEN-LAST:event_tab1TfCnpFocusLost

    private void tab1TfNumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab1TfNumeKeyTyped
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfNumeKeyTyped

    private void tab1TfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab1TfEmailKeyTyped
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfEmailKeyTyped

    private void tab1TfCnpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab1TfCnpKeyTyped
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfCnpKeyTyped

    private void tab1TfPrenumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab1TfPrenumeKeyTyped
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfPrenumeKeyTyped

    private void tab1TfNumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tab1TfNumeFocusLost
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfNumeFocusLost

    private void tab1TfPrenumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tab1TfPrenumeFocusLost
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfPrenumeFocusLost

    private void tab1TfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tab1TfEmailFocusLost
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfEmailFocusLost

    private void tab1TfCnpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab1TfCnpKeyReleased
        // TODO add your handling code here:
        checkFielduri();
    }//GEN-LAST:event_tab1TfCnpKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketsSystemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketsSystemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketsSystemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketsSystemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new TicketsSystemManagement().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TicketsSystemManagement.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TicketsSystemManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelDate;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBilete;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel tab1;
    private javax.swing.JLabel tab1LbAv;
    private javax.swing.JTextPane tab1TfCnp;
    private javax.swing.JTextPane tab1TfEmail;
    private javax.swing.JTextPane tab1TfNume;
    private javax.swing.JTextPane tab1TfPrenume;
    private javax.swing.JTextPane tab1TfTelefon;
    private javax.swing.JPanel tab2;
    // End of variables declaration//GEN-END:variables
}
