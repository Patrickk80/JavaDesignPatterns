package creational.builder;

public class LunchOrderBuilderDemo {

  public static void main(String[] args) {
    LunchOrderBuilder order = new LunchOrderBuilder.Builder().bread("wheat").condiments("con").meat("beef").dressing("mayo").build();

    System.out.println(order.getBread());
    System.out.println(order.getCondiments());
    System.out.println(order.getDressing());
    System.out.println(order.getMeat());
  }
}
