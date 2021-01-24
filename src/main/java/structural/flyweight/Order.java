package structural.flyweight;

public class Order {
  private final int orderNumber;
  private final Item item;

  public Order(int orderNumber, Item item) {
    this.orderNumber = orderNumber;
    this.item = item;
  }

  void processOrder() {
    System.out.printf("Ordering %s for item %s%n", item, orderNumber);
  }
}
