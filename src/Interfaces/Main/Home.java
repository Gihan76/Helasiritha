/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces.Main;

import Connection.DBconnect;
import Interfaces.DeliveryManagement.DeliveryHome;
import Interfaces.EventManagement.EventHome;
import Interfaces.StoreManagement.StoreHome;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gihan
 */
public class Home extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        con = DBconnect.connect();
        //---------set the JFrame to maximize by default on opening-------------
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelUserNameHome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonStore = new javax.swing.JButton();
        jButtonEmployee = new javax.swing.JButton();
        jButtonOrder = new javax.swing.JButton();
        jButtonDelivery = new javax.swing.JButton();
        jButtonCustomer = new javax.swing.JButton();
        jButtonEvent = new javax.swing.JButton();
        jButtonFinancial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.green);

        jLabelWelcome.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/sri-lanka.png"))); // NOI18N
        jLabelWelcome.setText("Helasiritha (Pvt) Ltd - Home");

        jLabelUserNameHome.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jLabelUserNameHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserNameHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.lightGray);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/pray.png"))); // NOI18N
        jLabel1.setText("Welcome Admin");

        jButtonStore.setBackground(java.awt.Color.cyan);
        jButtonStore.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonStore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/storeM.png"))); // NOI18N
        jButtonStore.setText("Store Management");
        jButtonStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoreActionPerformed(evt);
            }
        });

        jButtonEmployee.setBackground(java.awt.Color.cyan);
        jButtonEmployee.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/employeeM.png"))); // NOI18N
        jButtonEmployee.setText("Employee Management");
        jButtonEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeeActionPerformed(evt);
            }
        });

        jButtonOrder.setBackground(java.awt.Color.cyan);
        jButtonOrder.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/orderM.png"))); // NOI18N
        jButtonOrder.setText("Order Management");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });

        jButtonDelivery.setBackground(java.awt.Color.cyan);
        jButtonDelivery.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/deliveryM.png"))); // NOI18N
        jButtonDelivery.setText("Delivery Management");
        jButtonDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeliveryActionPerformed(evt);
            }
        });

        jButtonCustomer.setBackground(java.awt.Color.cyan);
        jButtonCustomer.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/customerM.png"))); // NOI18N
        jButtonCustomer.setText("Customer Management");
        jButtonCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerActionPerformed(evt);
            }
        });

        jButtonEvent.setBackground(java.awt.Color.cyan);
        jButtonEvent.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/eventM.png"))); // NOI18N
        jButtonEvent.setText("Event Management");
        jButtonEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventActionPerformed(evt);
            }
        });

        jButtonFinancial.setBackground(java.awt.Color.cyan);
        jButtonFinancial.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jButtonFinancial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Main/financialM.png"))); // NOI18N
        jButtonFinancial.setText("Financial Management");
        jButtonFinancial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinancialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonStore, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(198, 198, 198)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventActionPerformed
        EventHome eh = new EventHome();
        eh.setVisible(true);
    }//GEN-LAST:event_jButtonEventActionPerformed

    private void jButtonStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoreActionPerformed
        StoreHome sh = new StoreHome();
        sh.setVisible(true);
    }//GEN-LAST:event_jButtonStoreActionPerformed

    private void jButtonDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeliveryActionPerformed
        DeliveryHome dh = new DeliveryHome();
        dh.setVisible(true);
    }//GEN-LAST:event_jButtonDeliveryActionPerformed

    private void jButtonEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeeActionPerformed
        JOptionPane.showMessageDialog(null,"Still Not Developed","Alert",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonEmployeeActionPerformed

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
        JOptionPane.showMessageDialog(null,"Still Not Developed","Alert",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonOrderActionPerformed

    private void jButtonCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerActionPerformed
        JOptionPane.showMessageDialog(null,"Still Not Developed","Alert",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonCustomerActionPerformed

    private void jButtonFinancialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinancialActionPerformed
        JOptionPane.showMessageDialog(null,"Still Not Developed","Alert",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButtonFinancialActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCustomer;
    private javax.swing.JButton jButtonDelivery;
    private javax.swing.JButton jButtonEmployee;
    private javax.swing.JButton jButtonEvent;
    private javax.swing.JButton jButtonFinancial;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JButton jButtonStore;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelUserNameHome;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
