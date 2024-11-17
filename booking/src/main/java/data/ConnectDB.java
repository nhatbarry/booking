/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author nhatb
 */
public class ConnectDB {
    public static void connectMSSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String serverName = "NHAT\\BARRY";
            String dbName = "booking";
            String url = "jdbc:sqlserver://" + serverName + ":1433;DatabaseName=" + dbName + ";encrypt=true;trustServerCertificate=true";

            String username = "sa";
            String pass = "520sarangheyo";

            Connection connection = DriverManager.getConnection(url, username, pass);
            String sql = "select * from people";
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getInt(1) + ":  ");
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
