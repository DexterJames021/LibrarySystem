/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.library_management_system;

import java.awt.HeadlessException;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxedo
 */
public class frame1_category extends javax.swing.JInternalFrame {


    public frame1_category() {
        initComponents();
        Connect();
        Category_load();   
        
        
    try {
        this.setMaximum(true);
    } catch (PropertyVetoException ex) {
        Logger.getLogger(frame1_category.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
       BasicInternalFrameUI UI =(BasicInternalFrameUI)this.getUI();
       UI.setNorthPane(null);
    }

Connection conn;
PreparedStatement pst;
ResultSet rs;

public void Connect(){
    try{
            // Connection to Dataabse
     Class.forName("com.mysql.cj.jdbc.Driver");
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
    
     
    }catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }
  
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_category_name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb_status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_category = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Category");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Category Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Status:");

        txt_category_name.setBackground(new java.awt.Color(246, 245, 245));
        txt_category_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_category_name.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_add.setBackground(new java.awt.Color(41, 182, 246));
        btn_add.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(255, 193, 7));
        btn_update.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 82, 82));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cb_status.setBackground(new java.awt.Color(246, 245, 245));
        cb_status.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cb_status.setForeground(new java.awt.Color(51, 51, 51));
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table_category.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_category.setForeground(new java.awt.Color(51, 51, 51));
        table_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category name", "Status"
            }
        ));
        table_category.setGridColor(new java.awt.Color(0, 0, 0));
        table_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_category);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

     // ADD BUTTON   
        
     String category_name = txt_category_name.getText();
     String status = cb_status.getSelectedItem().toString();

        try{
            pst= conn.prepareStatement("INSERT INTO category(category_name,status)values(?,?)");
           // pst.setInt(1,);
            pst.setString(1,category_name);
            pst.setString(2,status);
//            pst.setString(1,;
           // pst.setString(1,String.valueOf(txt_category_name.getText()));
           // pst.setString(2,String.valueOf(cb_status.getSelectedItem()));
            //pst.setString(1,status); 
          //  pst = conn.prepareStatement(sqlquery);
            int k = pst.executeUpdate();

            if(k == 1){
                JOptionPane.showMessageDialog(this, "Category created");
                txt_category_name.setText("");
                cb_status.setSelectedIndex(-1);
                txt_category_name.requestFocus();
                  Category_load();   
                
            }else{
                JOptionPane.showMessageDialog(this, "Error");

            }

        }catch(HeadlessException | SQLException e){
           System.out.print(e);
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void table_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_categoryMouseClicked
               DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
               int selectIndex = table_category.getSelectedRow();
               
               int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
               txt_category_name.setText(d1.getValueAt(selectIndex,1).toString());
               cb_status.setSelectedItem(d1.getValueAt(selectIndex,2).toString());
               
               btn_add.setEnabled(false);
    }//GEN-LAST:event_table_categoryMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        // UPDATE BUTTON
        
        DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
               int selectIndex = table_category.getSelectedRow();
               
               int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        
        
        String category_name = txt_category_name.getText();
     String status = cb_status.getSelectedItem().toString();

        try{
            pst= conn.prepareStatement("UPDATE category set category_name=?,status =? WHERE id = ?");
           // pst.setInt(1,);
            pst.setString(1,category_name);
            pst.setString(2,status);
            pst.setInt(3,id);
//            pst.setString(1,;
           // pst.setString(1,String.valueOf(txt_category_name.getText()));
           // pst.setString(2,String.valueOf(cb_status.getSelectedItem()));
            //pst.setString(1,status); 
          //  pst = conn.prepareStatement(sqlquery);
            int k = pst.executeUpdate();

            if(k == 1){
                JOptionPane.showMessageDialog(this, "Category Updated");
                txt_category_name.setText("");
                cb_status.setSelectedIndex(-1);
                txt_category_name.requestFocus();
                  Category_load(); 
                  btn_add.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(this, "Error");

            }

        }catch(HeadlessException | SQLException e){
           System.out.print(e);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // DELETE BUTTON
        
        DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
               int selectIndex = table_category.getSelectedRow();
               
               int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        
        
//        String category_name = txt_category_name.getText();
//     String status = cb_status.getSelectedItem().toString();

        try{
            pst= conn.prepareStatement("DELETE from category WHERE id = ?");
           // pst.setInt(1,);
//            pst.setString(1,category_name);
//            pst.setString(2,status);
            pst.setInt(1,id);
//            pst.setString(1,;
           // pst.setString(1,String.valueOf(txt_category_name.getText()));
           // pst.setString(2,String.valueOf(cb_status.getSelectedItem()));
            //pst.setString(1,status); 
          //  pst = conn.prepareStatement(sqlquery);
            int k = pst.executeUpdate();

            if(k == 1){
                JOptionPane.showMessageDialog(this, "Category Deleted");
                txt_category_name.setText("");
                cb_status.setSelectedIndex(-1);
                txt_category_name.requestFocus();
                  Category_load(); 
                  btn_add.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(this, "Error");

            }

        }catch(HeadlessException | SQLException e){
           System.out.print(e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
   private void Category_load(){
           // String sqlquery = "SELECT * FROM `category`";
            int c;
        try{
            pst = conn.prepareStatement("SELECT * FROM `category`");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
           DefaultTableModel d = (DefaultTableModel)table_category.getModel();                 
//                                        table_category.setModel(DbUtils.resultSetToTableModel(rs));
                                        
           d.setRowCount(0);
           
           while (rs.next()){
               Vector v2 = new Vector();
               
               for(int i = 1; i <= c ;i++){
               v2.add(rs.getString("id"));
               v2.add(rs.getString("category_name"));
               v2.add(rs.getString("status"));
               }
               d.addRow(v2);
           }
                                        
    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_category;
    private javax.swing.JTextField txt_category_name;
    // End of variables declaration//GEN-END:variables
}
