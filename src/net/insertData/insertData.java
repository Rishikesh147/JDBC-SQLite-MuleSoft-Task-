package net.insertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertData {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:movieDB.db";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("database opened successfully");
            Statement statement = connection.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter movie name:");
            String name = sc.nextLine();
            System.out.println("enter actor name:");
            String actor = sc.nextLine();
            System.out.println("enter actress name:");
            String actress = sc.nextLine();
            System.out.println("enter director name:");
            String director = sc.nextLine();
            System.out.println("enter year of release:");
            Integer year = sc.nextInt();
            String sql = "INSERT INTO movies (name,actor,actress,director,year) " +
                         "VALUES ('" +name+ "','" + actor + "','" + actress + "','" + director + "'," + year+")";
            statement.executeUpdate(sql);
            System.out.println("inserted an entry successfully");

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("insertion FAILED!!");

        }
    }
}


