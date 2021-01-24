package structural.adapter;

public class EmployeeAdapterfromCSV implements Employee {

  private EmployeeCSV instance;

  public EmployeeAdapterfromCSV(EmployeeCSV instance) {
    this.instance = instance;
  }

  @Override
  public String getId() {
    return instance.getId() + "";
  }

  @Override
  public String getFirstName() {
    return instance.getFirstname();
  }

  @Override
  public String getLastName() {
    return instance.getLastname();
  }

  @Override
  public String getEmail() {
    return instance.getEmailAddress();
  }
}
