/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.avocat;

import static application.avocat.MysqlConnection.conn;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;



import java.util.Locale;

/**
 *
 * @author thamer
 */
public class ApplicationAvocat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        MysqlConnection connect = new MysqlConnection();
        connect.seConnecter();
        String sql = "INSERT INTO client (id_client, nom, prenom , date_naissance , cin , adresse , mail , id_case)" +
            "VALUES (?,?,?,?,?,?,?,?)";
             
             PreparedStatement preparedStatement = MysqlConnection.conn.prepareStatement(sql);
             preparedStatement.setInt(1, 1);
             preparedStatement.setString(2, "Test2");
             preparedStatement.setString(3, "Test3");
             preparedStatement.setDate(4,Date.valueOf("2010-04-02") );
             preparedStatement.setInt(5, 14201268);
             preparedStatement.setString(6, "Test3");
             preparedStatement.setString(7, "Test3");
             preparedStatement.setInt(8, 4);
           preparedStatement.executeUpdate(); 
             preparedStatement.close();
    }
    
}
