/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author  HP
 */
public class DBConnection {
    private static final String urlConnect = "jdbc:sqlserver://localhost:1433;databasename=QuizSystem;user=sa;password=sa;characterEncoding=UTF-8;encrypt=true;trustServerCertificate=true;";
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // tao doi tuong connection 
            Connection conn = DriverManager.getConnection(urlConnect);
            return conn;
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } 
        return null;
    }
    
    public static void main(String args[]) {
        System.out.println(getConnection());
    }
}