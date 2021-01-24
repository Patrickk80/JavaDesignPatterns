package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

  public static void main(String[] args) {

    String sql = "select * from movies where title = ?";
    List<String> parameters = new ArrayList<>();
    parameters.add("Star wars");
    Record record = new Record();

    Statement firstStatement = new Statement(sql, parameters, record);
    printStatement(firstStatement);

    Statement secondStatement = firstStatement.clone();

    printStatement(secondStatement);

    Registry registry = new Registry();
    Movie movie = (Movie) registry.createItem("Movie");
    movie.setTitle("Creational Patterns in Java");

    System.out.println(movie);
    System.out.println(movie.getRuntime());
    System.out.println(movie.getTitle());
    System.out.println(movie.getUrl());

    Movie anotherMovie =(Movie) registry.createItem("Movie");
    anotherMovie.setTitle("Gang of Four");

    System.out.println(anotherMovie);
    System.out.println(anotherMovie.getRuntime());
    System.out.println(anotherMovie.getTitle());
    System.out.println(anotherMovie.getUrl());
  }

  private static void printStatement(Statement statement) {
    System.out.println(statement.getSql());
    System.out.println(statement.getParameters());
    System.out.println(statement.getRecord());
  }
}
