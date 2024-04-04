/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class DbConnection {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456",
                    dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=MD19304Buoi7;encrypt=true;trustServerCertificate=true;";

                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                    System.err.println("Ket noi khong thanh cong");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
