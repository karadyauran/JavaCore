package org.example.sql_connections;

import java.sql.*;

// Simple Java program to connect to MySQL database running on localhost
// and running SELECT query to retrieve data from the database.
public class JDBCExample {
  private static final String URL = "jdbc:mysql://localhost:3306/home?serverTimezone=UTC";
  private static final String USER = "root";
  private static final String PASSWORD = "12345678";

  // connect to the database
  private Connection connect() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(URL, USER, PASSWORD);
      System.out.println("Connection to Store DB successful!");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return connection;
  }

  // get all users from the database
  public void getAllUsers() {
    String sql = "SELECT * FROM dataSource";
    try (Connection connection = this.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql)) {
      while (resultSet.next()) {
        System.out.printf("%s %s %s %s\n",
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("email"),
                resultSet.getString("gender")
        );
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    JDBCExample app = new JDBCExample();
    app.getAllUsers();
  }
}
