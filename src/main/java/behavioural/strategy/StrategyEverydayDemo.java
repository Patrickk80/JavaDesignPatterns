package behavioural.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

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

    persons.sort((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));

    System.out.println("\nSorted by age");
    printContent(persons);

    persons.sort(Comparator.comparing(Person::getName));

    System.out.println("\nSorted by name");
    printContent(persons);
  }
}
