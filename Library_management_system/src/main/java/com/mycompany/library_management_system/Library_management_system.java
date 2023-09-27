/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Library_management_system {
    
    public static Connection connect(){
     String user = "root";
     String pass = "";
    try{
            // Connection to Dataabse
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management?zeroDateTimeBehavior=CONVERT_TO_NULL",user,pass);
    
     return conn;
     
    }catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }
        return null;
    
}
    public static void main(String[] args) {
       new asd().show();
    }
}
