package Interfaces.DeliveryManagement;

import Connection.DBconnect;
import Interfaces.Main.Login;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Banuja
 */
public class DeliveryHome extends javax.swing.JFrame {
    
    

        Connection con = null;
         PreparedStatement pst = null;
         ResultSet rs = null;
         
         
    public DeliveryHome() {
       
       initComponents();
       
       setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
         
        //Connection to DB
        con= DBconnect.connect(); 
        
        //load table
        tableload();
        
        listOrder();
        
        //set Delivery jframe Icon
        setDelApplicationIcon();
    }
    
    public void tableload(){
        
        try{
            
            String sql = "SELECT id,c_name,d_address,d_date,d_fee,order_id FROM delivery ";
            pst =con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel (rs));
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        
        
    }
    
    public void listOrder(){
        try {
            String sql = "SELECT * from order_management";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                String orderName = rs.getString("o_customer_name");
                jComboBox1.addItem(orderName);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void setDelApplicationIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("package.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonDhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setBackground(new java.awt.Color(255, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel3.setText("DELIVERY MANAGEMENT");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setText("Delivery ID");

        jLabel5.setText("ID");

        jLabel6.setText("Customer Name");

        jLabel7.setText("Delivery Address");

        jLabel8.setText("Delivery Date");

        jLabel9.setText("Delivery Fee");

        jLabel10.setText("Order ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Order" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "Delivery Address", "Delivery Date", "Delivery Fee", "Order"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/update.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/remove.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/clear_search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/search.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/clear.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/print.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/DeliveryManagement/pdf.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 313, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(187, 187, 187)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(69, 69, 69))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(601, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        jButtonDhome.setText("Home");
        jButtonDhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(jButtonDhome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDhome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Add
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String name = jTextField2.getText();
        String address = jTextArea1.getText();
        Date date = jXDatePicker1.getDate();
        String fee = jTextField1.getText();
        String order = jComboBox1.getSelectedItem().toString();
        
        if (name.equals("")) {
                JOptionPane.showMessageDialog(null,"Please fill customer name!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(address.trim().length()==0){
                JOptionPane.showMessageDialog(null,"Please fill the address!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(date==null){
                JOptionPane.showMessageDialog(null,"Please fill the date!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(fee.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill the fee!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(!fee.matches("\\d*(\\.\\d{0,2})?")){
                JOptionPane.showMessageDialog(null,"Please fill the valid fee!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(order == "Select Order"){
                JOptionPane.showMessageDialog(null,"Please select an order!","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            try{
           
                DateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String FormatedDate = DateFormat.format(date);
                
                String add_sql =" INSERT INTO delivery (c_name,d_address,d_date,d_fee,order_id) values ('"+ name +"','"+ address +"','"+ FormatedDate +"','"+ fee +"','"+ order +"') ";

                pst = con.prepareStatement(add_sql);

                pst.execute();

                JOptionPane.showMessageDialog(null,"Delivery Added Successfully!");

                tableload();

                //set field values null
                    jTextField2.setText("");
                    jTextField1.setText("");
                    jComboBox1.setSelectedIndex(0);
                    jTextArea1.setText(null);
                    jXDatePicker1.setDate(null);

            }
            catch(Exception e){

                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int x =jTable1.getSelectedRow();
        
        String id =jTable1.getValueAt(x, 0).toString();
        String name = jTable1.getValueAt(x, 1).toString();
        String address = jTable1.getValueAt(x, 2).toString();
        String date = jTable1.getValueAt(x, 3).toString();
        String fee = jTable1.getValueAt(x, 4).toString();
        String order = jTable1.getValueAt(x, 5).toString();
        
        
        jLabel4.setText(id);
        jTextField2.setText(name);
        jTextArea1.setText(address);
        jTextField1.setText(fee);
        jComboBox1.setSelectedItem(order);
        
        
        try {
           
            Date dateFormat = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            jXDatePicker1.setDate(dateFormat);
        
        }
        catch (Exception e) 
        {
           
            System.out.println(e);
        }
                
       
    }//GEN-LAST:event_jTable1MouseClicked

    //Update
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
         int x =  JOptionPane.showConfirmDialog(null, "Do you really want to UPDATE ! ! !");
         
         if ( x == 0 ){
         
        String id = jLabel4.getText();
        String name = jTextField2.getText();
        String address = jTextArea1.getText();
        Date date = jXDatePicker1.getDate() ;
        DateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String FormatedDate = DateFormat.format(date);
        String fee = jTextField1.getText();
        String order = jComboBox1.getSelectedItem().toString();
        
        if (name.equals("")) {
                JOptionPane.showMessageDialog(null,"Please fill customer name!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(address.trim().length()==0){
                JOptionPane.showMessageDialog(null,"Please fill the address!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(date==null){
                JOptionPane.showMessageDialog(null,"Please fill the date!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(fee.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill the fee!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(!fee.matches("\\d*(\\.\\d{0,2})?")){
                JOptionPane.showMessageDialog(null,"Please fill the valid fee!","Alert",JOptionPane.WARNING_MESSAGE);
        }else if(order == "Select Order"){
                JOptionPane.showMessageDialog(null,"Please select an order!","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
            try{
            String update_sql = " UPDATE delivery set c_name ='"+ name +"',d_address ='"+ address +"' ,d_date ='"+ FormatedDate +"' ,d_fee ='"+ fee +"' ,order_id ='"+ order +"' where id ='"+ id +"' ";
            pst = con.prepareStatement(update_sql);
            pst.execute();
        
            JOptionPane.showMessageDialog(null,"Delivery Updated Successfully!");
            
            tableload(); 
              
            //set field values null
            jTextField2.setText("");
            jTextField1.setText("");
            jComboBox1.setSelectedIndex(0);
            jTextArea1.setText(null);
            jXDatePicker1.setDate(null);
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
             
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Delete
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
         int x = JOptionPane.showConfirmDialog(null,"Do you really want to deldte ?");
        
        if (x == 0){
            
            String id = jLabel4.getText();
            
            String sql = "DELETE from delivery where id ='"+ id +"' ";
            
            try{
                
                pst =con.prepareStatement(sql);
                pst.execute();
                
                
                tableload();
                
                //set field values null
                 jTextField2.setText("");
                 jTextField1.setText("");
                 jComboBox1.setSelectedIndex(0);
                 jTextArea1.setText(null);
                 jXDatePicker1.setDate(null);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //Search-Clear
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jTextField3.setText("");
        
         try {
             
           String allResult = "SELECT * From delivery ";
           pst = con.prepareStatement(allResult);
           rs = pst.executeQuery();
            
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
         } 
        catch (Exception e) {
            
            System.out.println(e);
       
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    //Search
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        String searchValue = jTextField3.getText();
       
        try {
            
            String searchResult = "SELECT id AS ID , c_name AS Customer_Name ,d_address AS Delivert_Address ,d_date AS Delivery_Date ,d_fee AS Delivery_Fee ,order_id AS Order_ID FROM delivery WHERE id LIKE '%"+ searchValue +"%' OR c_name LIKE '%"+ searchValue +"%' OR d_address LIKE '%"+ searchValue +"%' OR  d_date LIKE '%"+ searchValue +"%' OR d_fee LIKE '%"+ searchValue +"%' OR order_id LIKE '%"+ searchValue +"%'";
           pst = con.prepareStatement(searchResult);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    //Clear
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        jLabel4.setText("Delivery ID");
        jTextField2.setText(null);
        jTextArea1.setText(null);
        jTextField1.setText(null);
        jComboBox1.setSelectedIndex(0);
        jXDatePicker1.setDate(null);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    //Print
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
         try {
            boolean print = jTable1.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print Please Try Again!");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    //PDF
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

         String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        if(x == JFileChooser.APPROVE_OPTION){
            path = jfc.getSelectedFile().getPath();
        }
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"DeliveryDetailsList.pdf"));
            doc.open();
            
            //title of the pdf
            Paragraph para = new Paragraph("Helasiritha Delivery Details List");
            para.setAlignment(Element.ALIGN_CENTER);
            
            doc.add(para);
            
            // add a blank line
            doc.add( Chunk.NEWLINE );
            
            PdfPTable tbl = new PdfPTable(6);
            //table headers
            tbl.addCell("Delivery ID");
            tbl.addCell("Customer Name");
            tbl.addCell("Delivery Address");
            tbl.addCell("Delivery Date");
            tbl.addCell("Delivery Fee");
            tbl.addCell("Order ID");
            
            for(int i = 0; i < jTable1.getRowCount(); i++){
                String Id = jTable1.getValueAt(i, 0).toString();
                String Name = jTable1.getValueAt(i, 1).toString();
                String Address = jTable1.getValueAt(i, 2).toString();
                String Date = jTable1.getValueAt(i, 3).toString();
                String Fee = jTable1.getValueAt(i, 4).toString();
                String OrderId = jTable1.getValueAt(i, 5).toString();
                
                tbl.addCell(Id);
                tbl.addCell(Name);
                tbl.addCell(Address);
                tbl.addCell(Date);
                tbl.addCell(Fee);               
                tbl.addCell(OrderId);
            }
            doc.add(tbl);
              
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(DeliveryHome.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        doc.close();
        JOptionPane.showMessageDialog(null,"PDF Generated Successfully!");    
        
    }//GEN-LAST:event_jButton8ActionPerformed
    
    //Home Button
    private void jButtonDhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDhomeActionPerformed
       
        Login l = new Login();
        String home = "Home";
        String logout = "Logout";
        
        if (jButtonDhome.getText().equals(logout)) {
            this.dispose();
            l.setVisible(true);
        } else if(jButtonDhome.getText().equals(home)){
            this.dispose();
        }
       
    }//GEN-LAST:event_jButtonDhomeActionPerformed

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
            java.util.logging.Logger.getLogger(DeliveryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public javax.swing.JButton jButtonDhome;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
