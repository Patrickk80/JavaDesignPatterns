package structural.facade;

import creational.singleton.DBSingleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

  public static void main(String[] args) {
    DBSingleton dbSingleton = DBSingleton.getInstance();

    try {
      Connection con = dbSingleton.getConn();

      Statement sta = con.createStatement();
      sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
      System.out.println("Table created.");
      sta.close();

      sta = con.createStatement();
      int count = sta.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES (1, 'Rupelmondepad', 'Eindhoven')");
      System.out.println(count + " records created");
      sta.close();

      sta = con.createStatement();
      ResultSet rs = sta.executeQuery("SELECT * FROM Address");

      while (rs.next()) {
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
      }
      sta.close();

    } catch (Exception e) {

    }
  }
}
