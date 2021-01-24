package behavioural.memento;

import java.util.Stack;

//caretaker
public class Caretaker {
  private Stack<EmployeeMomento> employeeHistory = new Stack<>();

  public void save(Employee employee) {
    employeeHistory.push(employee.save());
  }

  public void revert(Employee emp) {
    emp.revert(employeeHistory.pop());
  }
}
