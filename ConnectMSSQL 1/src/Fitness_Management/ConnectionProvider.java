/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness_Management;

import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=HasibColche;selectMethod=cursor", "sa", "123456");
                return con;
            
        }
        catch(Exception e)
        {
            
            return null;
            
        }
    }
    
}
