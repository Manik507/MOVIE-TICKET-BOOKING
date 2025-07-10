package com.project;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    public static void log(String message) {
        try {
            FileWriter writer = new FileWriter("booking_logs.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
