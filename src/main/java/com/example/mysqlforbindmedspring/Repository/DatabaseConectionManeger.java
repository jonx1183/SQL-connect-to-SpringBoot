package com.example.mysqlforbindmedspring.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConectionManeger {

  // varibles
  private static String hostName;
  private static String userName;
  private static String passWord;
  private static Connection con;

  //Methods
  public static Connection getConnection() {
    hostName = "jdbc:mysql://jonstestserver.mysql.database.azure.com/kea";
    userName = "jonx1183";
    passWord = "Wolf1712";
    try {
      con = DriverManager.getConnection(hostName, userName, passWord);

    } catch (SQLException e) {
      System.out.println("No Connection");
      e.printStackTrace();
    }
    System.out.println("Connected");
    return con;
  }


}
