/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.avocat;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thamer
 */
public class MysqlConnection {
    
       static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
       static final String DB_URL = "jdbc:mysql://localhost:3306/appavocat";
       static final String USER = "root";
       static final String PASS = "";
       
   static Connection conn = null;
   
   
    static void seConnecter(){
      try {
           try {
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
             System.out.println("Connecting to a selected database...");
           try {
               conn = DriverManager.getConnection(DB_URL, USER, PASS);
           } catch (SQLException ex) {
               Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
             System.out.println("Connected database successfully...");
             System.out.println("Inserting records into the table...");

           
        } catch(Exception se){
          System.out.println("erreur");

      
     }
}
  
    
}
