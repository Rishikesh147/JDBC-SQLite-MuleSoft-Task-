package net.createDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class createDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:movieDB.db");
        } catch (Exception e) {
            System.out.println("database creation FAILED !! ");
        }
        System.out.println("database created successfully");
    }
}
