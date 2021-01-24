package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

  public List<Employee> getEmployeeList() {
    List<Employee> employees = new ArrayList<>();

    Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick","john@wick.com");
    employees.add(employeeFromDB);

    EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "solo", "han","han@solo.com");
    employees.add(new EmployeeAdapterFromLdap(employeeFromLdap));

    EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
    employees.add(new EmployeeAdapterfromCSV(employeeFromCSV));

    return employees;
  }
}
