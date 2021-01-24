package structural.facade;

import java.util.List;
import structural.facade.JdbcFacade.Address;

public class FacadeJdbcDemo {

  public static void main(String[] args) {
    JdbcFacade jdbcFacade = new JdbcFacade();

    jdbcFacade.createTable();
    jdbcFacade.insertIntoTable();
    List<Address> addressList = jdbcFacade.getAddresses();

    for(Address address : addressList) {
      System.out.println(address.toString());
    }
  }
}
