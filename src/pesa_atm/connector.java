/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesa_atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaleen
 */
public class connector {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/pesa_bank";
    static final String USER ="root";
    static final String PASS ="lozi";
    
     Connection con ;
     Statement stmt;
     ResultSet res;
     PreparedStatement pre;
    
  
     public  connector(){  
      try{
        Class.forName( JDBC_DRIVER); 
          con = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = con.createStatement();
   }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
   }
     
      }
      public static Connection connector() throws ClassNotFoundException, SQLException{
          try{
           Class.forName( JDBC_DRIVER); 
         Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
          if(con!=null)return con ;
   }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
   }
   return null ;
       
 }
}

    
    
    

