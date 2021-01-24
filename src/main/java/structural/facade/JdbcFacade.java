package structural.facade;

import creational.singleton.DBSingleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

  private final DBSingleton instance;

  public JdbcFacade() {
    instance = DBSingleton.getInstance();
  }

  public int createTable() {
    int count = 0;
    try {
      Connection conn = instance.getConn();
      Statement sta = conn.createStatement();
      count = sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
      System.out.println("Table created.");
      sta.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return count;
  }

  public int insertIntoTable() {
    int count = 0;
    try {
      Connection conn = instance.getConn();
      Statement sta = conn.createStatement();
      count = sta.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES (1, 'Rupelmondepad', 'Eindhoven')");
      System.out.println(count + " records created");
      sta.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return count;
  }

  public List<Address> getAddresses() {
    List<Address> addresses = new ArrayList<>();

    try {
      Connection conn = instance.getConn();
      Statement sta = conn.createStatement();
      ResultSet rs = sta.executeQuery("SELECT * FROM Address");

      while (rs.next()) {
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        Address address = new Address();
        address.setID(rs.getInt(1));
        address.setStreet(rs.getString(2));
        address.setCity(rs.getString(3));

        addresses.add(address);
      }

      rs.close();
      sta.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return addresses;
  }

  class Address {

    private int ID;
    private String Street;
    private String City;

    public int getID() {
      return ID;
    }

    public void setID(int ID) {
      this.ID = ID;
    }

    public String getStreet() {
      return Street;
    }

    public void setStreet(String street) {
      Street = street;
    }

    public String getCity() {
      return City;
    }

    public void setCity(String city) {
      City = city;
    }
  }
}
