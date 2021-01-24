package behavioural.memento;

//memento
public class EmployeeMomento {

  private String name;
  private String phone;

  public EmployeeMomento(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }
}
