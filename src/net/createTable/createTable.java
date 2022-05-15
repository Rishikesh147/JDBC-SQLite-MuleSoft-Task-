package net.createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:movieDB.db";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("database opened successfully");
            Statement statement = connection.createStatement();
            String sql = "create table movies (name varchar(40),actor varchar(40), actress varchar(40),director varchar(40), year INT)";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("table creation failed");
            System.exit(0);
        }
        System.out.println("table created successfully");
    }
}