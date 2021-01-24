package behavioural.template;

public class StoreOrder extends OrderTemplate {

  @Override
  protected void doCheckout() {
    System.out.println("Ring up items from cart.");
  }

  @Override
  protected void doPayment() {
    System.out.println("Process payment with Card present");
  }

  @Override
  protected void doReceipt() {
    System.out.println("Print receipt");
  }

  @Override
  protected void doDelivery() {
    System.out.println("Bag items at counter");
  }
}
