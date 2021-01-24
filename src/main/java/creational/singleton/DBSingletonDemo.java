package creational.singleton;

import java.sql.Connection;

public class DBSingletonDemo {

  public static void main(String[] args) {
    DBSingleton instance = DBSingleton.getInstance();

    long timeBefore = 0;
    long timeAfter = 0;

    System.out.println(instance);

    timeBefore = System.currentTimeMillis();
    Connection conn = instance.getConn();
    timeAfter = System.currentTimeMillis();

    System.out.println(timeAfter - timeBefore);

    try {
      conn.createStatement()
          .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
      System.out.println("Table created.");
    } catch (Exception e) {
      e.printStackTrace();
    }

    timeBefore = System.currentTimeMillis();
    instance.getConn();
    timeAfter = System.currentTimeMillis();

    System.out.println(timeAfter - timeBefore);
  }
}
