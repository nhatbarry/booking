/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nhatb
 */
public class JDBC {
    public static boolean register(String username, String password){
        try {
            if (!isUserExist(username)) {
                Connection connection = DriverManager.getConnection(Constant.DB_URL, Constant.DB_USERNAME, Constant.DB_PASSWORD);
                PreparedStatement sql = connection.prepareStatement("exec register @username = ?, @password = ?");
                sql.setString(1, username);
                sql.setString(2, password);
                sql.executeUpdate();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isUserExist(String username){
        try {
            Connection connection = DriverManager.getConnection(Constant.DB_URL, Constant.DB_USERNAME, Constant.DB_PASSWORD);
            PreparedStatement sql = connection.prepareStatement("select * from login where user_name = ?");
            sql.setString(1, username);
            ResultSet rs = sql.executeQuery();
            if (!rs.isBeforeFirst()) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
