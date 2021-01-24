package behavioural.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateEverydayDemo {

  static void printContent(List<Person> persons) {
    persons.forEach(p -> System.out.println(p.getName()));
  }
  public static void main(String[] args) {
    Person byan = new Person("Bryan", "111", 39);
    Person mark = new Person("Mark", "222", 41);
    Person chris = new Person("Chris", "333", 38);

    List<Person> persons = new ArrayList<>();
    persons.add(byan);
    persons.add(mark);
    persons.add(chris);

    System.out.println("Not sorted");
    printContent(persons);

    Collections.sort(persons);

    System.out.println("\nSorted by age");
    printContent(persons);
  }
}
