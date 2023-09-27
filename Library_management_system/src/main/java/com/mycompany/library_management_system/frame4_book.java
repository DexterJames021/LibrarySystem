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
public class frame4_book extends javax.swing.JInternalFrame {

    /**
     * Creates new form frame2_author
     */
    public frame4_book() {
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
        txt_book_name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_contents = new javax.swing.JTextField();
        cb_category = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_author = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_publisher = new javax.swing.JComboBox<>();
        txt_no_of_page = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_edition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_category = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Category:");

        txt_book_name.setBackground(new java.awt.Color(246, 245, 245));
        txt_book_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_book_name.setForeground(new java.awt.Color(51, 51, 51));

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Contents:");

        txt_contents.setBackground(new java.awt.Color(246, 245, 245));
        txt_contents.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_contents.setForeground(new java.awt.Color(51, 51, 51));

        cb_category.setBackground(new java.awt.Color(246, 245, 245));
        cb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Author:");

        cb_author.setBackground(new java.awt.Color(246, 245, 245));
        cb_author.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Publisher:");

        cb_publisher.setBackground(new java.awt.Color(246, 245, 245));
        cb_publisher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_no_of_page.setBackground(new java.awt.Color(246, 245, 245));
        txt_no_of_page.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_no_of_page.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("No. of Pages:");

        txt_edition.setBackground(new java.awt.Color(246, 245, 245));
        txt_edition.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_edition.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Edition:");

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
                    .addComponent(txt_book_name)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_contents)
                    .addComponent(cb_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_author, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_publisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_no_of_page)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(txt_edition)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_category, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_author, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_no_of_page, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table_category.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_category.setForeground(new java.awt.Color(51, 51, 51));
        table_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Author name", "Address", "Phone number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        // ADD BUTTON

        String author_name = txt_book_name.getText();
        String address = txt_address.getText();
        String phone = txt_contents.getText();

        try{
            pst= conn.prepareStatement("INSERT INTO author(author_name,address,phone_number)values(?,?,?)");
            // pst.setInt(1,);
            pst.setString(1,author_name);
            pst.setString(2,address);
            pst.setString(3,phone);
            //            pst.setString(1,;
                // pst.setString(1,String.valueOf(txt_category_name.getText()));
                // pst.setString(2,String.valueOf(cb_status.getSelectedItem()));
                //pst.setString(1,status);
                //  pst = conn.prepareStatement(sqlquery);
                int k = pst.executeUpdate();

                if(k == 1){
                    JOptionPane.showMessageDialog(this, "Author created");
                    txt_book_name.setText("");
                    txt_address.setText("");
                    txt_contents.setText("");
                    txt_book_name.requestFocus();
                    Category_load();

                }else{
                    JOptionPane.showMessageDialog(this, "Error");

                }

            }catch(HeadlessException | SQLException e){
                System.out.print(e);
            }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        // UPDATE BUTTON

        DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
        int selectIndex = table_category.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());

        String author_name = txt_book_name.getText();
        String address = txt_address.getText();
        String phone = txt_contents.getText();

        try{
            pst= conn.prepareStatement("UPDATE author set author_name=?,address=?,phone_number=? WHERE id = ?");
            pst.setString(1,author_name);
            pst.setString(2,address);
            pst.setString(3,phone);
            pst.setInt(4,id);
                int k = pst.executeUpdate();

                if(k == 1){
                    JOptionPane.showMessageDialog(this, "Category Updated");
                    txt_book_name.setText("");
                    txt_address.setText("");
                    txt_contents.setText("");
                    txt_book_name.requestFocus();
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
            pst= conn.prepareStatement("DELETE from author WHERE id = ?");
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
                    txt_book_name.setText("");
                    txt_address.setText("");
                    txt_contents.setText("");
                    txt_book_name.requestFocus();
                    Category_load();
                    btn_add.setEnabled(true);

                }else{
                    JOptionPane.showMessageDialog(this, "Error");

                }

            }catch(HeadlessException | SQLException e){
                System.out.print(e);
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_categoryMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
        int selectIndex = table_category.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        txt_book_name.setText(d1.getValueAt(selectIndex,1).toString());
        txt_address.setText(d1.getValueAt(selectIndex,2).toString());
        txt_contents.setText(d1.getValueAt(selectIndex,3).toString());

        btn_add.setEnabled(false);
    }//GEN-LAST:event_table_categoryMouseClicked
   private void Category_load(){
           // String sqlquery = "SELECT * FROM `category`";
            int c;
        try{
            pst = conn.prepareStatement("SELECT * FROM `author`");
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
               v2.add(rs.getString("author_name"));
               v2.add(rs.getString("address"));
               v2.add(rs.getString("phone_number"));
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
    private javax.swing.JComboBox<String> cb_author;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JComboBox<String> cb_publisher;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_category;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JTextField txt_contents;
    private javax.swing.JTextField txt_edition;
    private javax.swing.JTextField txt_no_of_page;
    // End of variables declaration//GEN-END:variables
}
