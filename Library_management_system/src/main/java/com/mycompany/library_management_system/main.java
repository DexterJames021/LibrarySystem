/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library_management_system;

import java.awt.Color;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxedo
 */
public class main extends javax.swing.JFrame {

Color DefaultColor,ClickedColor;
    public main() {
        initComponents();
                  
        setExtendedState(main.MAXIMIZED_BOTH);
        conn=  Library_management_system.connect();
        
        Connect();
        Category_load();  

        
      DefaultColor = new Color(51,51,51);
      ClickedColor = new Color(102,102,102);
      frame2.setBackground(ClickedColor);  
      frame3.setBackground(DefaultColor);
      frame4.setBackground(DefaultColor);
      frame5.setBackground(DefaultColor);
      frame6.setBackground(DefaultColor);
      frame7.setBackground(DefaultColor);
      frame8.setBackground(DefaultColor);

    }

Connection conn;
PreparedStatement pst;
ResultSet rs;

public void Connect(){
    try{
            // Connection to Dataabse
     Class.forName("com.mysql.cj.jdbc.Driver");
     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
    
     
    }catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }
  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_category = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_category_name = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb_status = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        frame2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        frame3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        frame4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        frame5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        frame6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        frame7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        frame8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Category");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Category Name:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Status:");

        txt_category_name.setBackground(new java.awt.Color(246, 245, 245));
        txt_category_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_category_name.setForeground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cb_status.setBackground(new java.awt.Color(246, 245, 245));
        cb_status.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cb_status.setForeground(new java.awt.Color(51, 51, 51));
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        frame2.setBackground(new java.awt.Color(84, 84, 84));
        frame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame2MousePressed(evt);
            }
        });
        frame2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                frame2PropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Category");

        javax.swing.GroupLayout frame2Layout = new javax.swing.GroupLayout(frame2);
        frame2.setLayout(frame2Layout);
        frame2Layout.setHorizontalGroup(
            frame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame2Layout.setVerticalGroup(
            frame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        frame3.setBackground(new java.awt.Color(51, 51, 51));
        frame3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame3MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Author");

        javax.swing.GroupLayout frame3Layout = new javax.swing.GroupLayout(frame3);
        frame3.setLayout(frame3Layout);
        frame3Layout.setHorizontalGroup(
            frame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame3Layout.setVerticalGroup(
            frame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame4.setBackground(new java.awt.Color(51, 51, 51));
        frame4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame4MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Publisher");

        javax.swing.GroupLayout frame4Layout = new javax.swing.GroupLayout(frame4);
        frame4.setLayout(frame4Layout);
        frame4Layout.setHorizontalGroup(
            frame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame4Layout.setVerticalGroup(
            frame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame5.setBackground(new java.awt.Color(51, 51, 51));
        frame5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame5MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Book");

        javax.swing.GroupLayout frame5Layout = new javax.swing.GroupLayout(frame5);
        frame5.setLayout(frame5Layout);
        frame5Layout.setHorizontalGroup(
            frame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame5Layout.setVerticalGroup(
            frame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Library Management System");

        frame6.setBackground(new java.awt.Color(51, 51, 51));
        frame6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame6MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Member");

        javax.swing.GroupLayout frame6Layout = new javax.swing.GroupLayout(frame6);
        frame6.setLayout(frame6Layout);
        frame6Layout.setHorizontalGroup(
            frame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame6Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame6Layout.setVerticalGroup(
            frame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        frame7.setBackground(new java.awt.Color(51, 51, 51));
        frame7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame7MousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Issue Book");

        javax.swing.GroupLayout frame7Layout = new javax.swing.GroupLayout(frame7);
        frame7.setLayout(frame7Layout);
        frame7Layout.setHorizontalGroup(
            frame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame7Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame7Layout.setVerticalGroup(
            frame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame8.setBackground(new java.awt.Color(51, 51, 51));
        frame8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frame8MousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Return Book");

        javax.swing.GroupLayout frame8Layout = new javax.swing.GroupLayout(frame8);
        frame8.setLayout(frame8Layout);
        frame8Layout.setHorizontalGroup(
            frame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frame8Layout.setVerticalGroup(
            frame8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 82, 82));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Log out");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(frame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(frame5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frame6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(frame7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(frame8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(572, 572, 572)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(frame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frame4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frame5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frame6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frame7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(frame2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(frame8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frame2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame2MouseClicked
        // TODO add your handling code here:
        try {
            frame1_category frame_2 = new frame1_category();
            jDesktopPane1.removeAll();
            jDesktopPane1.add(frame_2).setVisible(true);

            frame_2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_frame2MouseClicked

    private void frame2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame2MousePressed
        // TODO add your handling code here:
        frame2.setBackground(ClickedColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame2MousePressed

    private void frame2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_frame2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_frame2PropertyChange

    private void frame3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame3MouseClicked
        // TODO add your handling code here:
        frame2_author frame_3 = new frame2_author();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(frame_3).setVisible(true);
    }//GEN-LAST:event_frame3MouseClicked

    private void frame3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame3MousePressed
        // TODO add your handling code here:
        
        frame2.setBackground(DefaultColor);
        frame3.setBackground(ClickedColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame3MousePressed

    private void frame4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame4MouseClicked
        // TODO add your handling code here:
        frame3_publisher frame_4 = new frame3_publisher();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(frame_4).setVisible(true);
    }//GEN-LAST:event_frame4MouseClicked

    private void frame4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame4MousePressed
        // TODO add your handling code here:
        frame2.setBackground(DefaultColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(ClickedColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame4MousePressed

    private void frame5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame5MouseClicked
        // TODO add your handling code here:
        frame4_book frame_5 = new frame4_book();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(frame_5).setVisible(true);
    }//GEN-LAST:event_frame5MouseClicked

    private void frame5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame5MousePressed
        // TODO add your handling code here:
        frame2.setBackground(DefaultColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(ClickedColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame5MousePressed

    private void frame6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame6MouseClicked
        // TODO add your handling code here:
        frame5_member frame_6 = new frame5_member();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(frame_6).setVisible(true);
    }//GEN-LAST:event_frame6MouseClicked

    private void frame6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame6MousePressed
        // TODO add your handling code here:
        frame2.setBackground(DefaultColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(ClickedColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame6MousePressed

    private void frame7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame7MouseClicked
                // TODO add your handling code here:
                frame6_issuebook frame_7 = new frame6_issuebook();
                jDesktopPane1.removeAll();
                jDesktopPane1.add(frame_7).setVisible(true);
    }//GEN-LAST:event_frame7MouseClicked

    private void frame7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame7MousePressed
        frame2.setBackground(DefaultColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(ClickedColor);
        frame8.setBackground(DefaultColor);
    }//GEN-LAST:event_frame7MousePressed

    private void frame8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame8MouseClicked
                     frame7_returnbook frame_8 = new frame7_returnbook();
                jDesktopPane1.removeAll();
                jDesktopPane1.add(frame_8).setVisible(true);
    }//GEN-LAST:event_frame8MouseClicked

    private void frame8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frame8MousePressed
        frame2.setBackground(DefaultColor);
        frame3.setBackground(DefaultColor);
        frame4.setBackground(DefaultColor);
        frame5.setBackground(DefaultColor);
        frame6.setBackground(DefaultColor);
        frame7.setBackground(DefaultColor);
        frame8.setBackground(ClickedColor);

        // TODO add your handling code here:
    }//GEN-LAST:event_frame8MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Log out?","Select",JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_categoryMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)table_category.getModel();
        int selectIndex = table_category.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());
        txt_category_name.setText(d1.getValueAt(selectIndex,1).toString());
        cb_status.setSelectedItem(d1.getValueAt(selectIndex,2).toString());

        btn_add.setEnabled(false);
    }//GEN-LAST:event_table_categoryMouseClicked

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

        try{
            pst= conn.prepareStatement("DELETE from category WHERE id = ?");
            pst.setInt(1,id);
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

            }catch(SQLException e){
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JPanel frame1;
    private javax.swing.JPanel frame2;
    private javax.swing.JPanel frame3;
    private javax.swing.JPanel frame4;
    private javax.swing.JPanel frame5;
    private javax.swing.JPanel frame6;
    private javax.swing.JPanel frame7;
    private javax.swing.JPanel frame8;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_category;
    private javax.swing.JTextField txt_category_name;
    // End of variables declaration//GEN-END:variables
}
