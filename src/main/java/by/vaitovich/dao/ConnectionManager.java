package by.vaitovich.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/store_db";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "root";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


