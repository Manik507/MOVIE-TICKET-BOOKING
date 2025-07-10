package com.project;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/moviedb", "postgres", "Manik1092");
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e);
        }
        return conn;
    }
}
