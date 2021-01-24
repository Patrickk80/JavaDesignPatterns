package behavioural.memento;

public class MementoDemo {

  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();

    Employee emp = new Employee();
    emp.setName("John Wick");
    emp.setAddress("111 Main Street");
    emp.setPhone("888-5551212");

    System.out.println("Employee before save: " + emp);

    caretaker.save(emp);

    emp.setPhone("444-555-6666");

    caretaker.save(emp);

    System.out.println("Employee after changing phone number: " + emp);

    emp.setPhone("333-999-6666"); //Dont save

    caretaker.revert(emp);

    System.out.println("Reverts to last save point: " + emp);

    caretaker.revert(emp);

    System.out.println("Revert to original: " + emp);
  }
}
