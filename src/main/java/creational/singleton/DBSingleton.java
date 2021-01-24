package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class DBSingleton {

  private static volatile DBSingleton instance;
  private static volatile Connection conn;

  private DBSingleton() {

    if (!Objects.isNull(conn)) {
      throw new RuntimeException("Use getConnection method");
    }

    if (!Objects.isNull(instance)) {
      throw new RuntimeException("Use getInstance method");
    }
  }

  public static DBSingleton getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (DBSingleton.class) {
        if (Objects.isNull(instance)) {
          instance = new DBSingleton();
        }
      }
    }

    return instance;
  }

  public Connection getConn() {
    try {
      if (Objects.isNull(conn) || conn.isClosed()) {
        synchronized (DBSingleton.class) {
          if (Objects.isNull(conn) || conn.isClosed()) {
            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
            conn = DriverManager.getConnection(dbUrl);
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
}