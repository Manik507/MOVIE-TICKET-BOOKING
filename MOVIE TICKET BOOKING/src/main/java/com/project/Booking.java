package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Booking {
    public static void bookTicket(int movieId, String customerName) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            try {
                String sql = "INSERT INTO bookings(movie_id, customer_name) VALUES (?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, movieId);
                pst.setString(2, customerName);
                pst.executeUpdate();
                System.out.println("Booking Successful for " + customerName);
                FileLogger.log("Booked movie ID " + movieId + " for " + customerName);
                conn.close();
            } catch (SQLException e) {
                System.out.println("Booking failed: " + e.getMessage());
            }
        }
    }
}
