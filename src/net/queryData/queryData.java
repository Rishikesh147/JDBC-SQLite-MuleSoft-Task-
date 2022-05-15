package net.queryData;

import java.sql.*;

public class queryData {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:movieDB.db";
        try{
            Connection connection = DriverManager.getConnection(jdbcUrl);
           // String sql = "SELECT rowid, * FROM movies";
            String sql = "SELECT rowid, * FROM movies where actor='anupam kher'";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while(result.next()){
                Integer id = result.getInt("rowid");
                String name = result.getString("name");
                String actor = result.getString("actor");
                String actress = result.getString("actress");
                String director = result.getString("director");
                Integer year = result.getInt("year");

                System.out.println(id + " | " + name + " | " + actor + " | " + actress + " | " + director + " | " + year);
            }
        } catch (SQLException e) {
            System.out.println("error connecting to sqlite database");
            e.printStackTrace();
        }

    }

}
