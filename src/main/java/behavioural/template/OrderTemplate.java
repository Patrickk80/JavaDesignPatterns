package behavioural.template;

public abstract class OrderTemplate {

  public boolean isGift;
  protected abstract void doCheckout();
  protected abstract void doPayment();
  protected abstract void doReceipt();
  protected abstract void doDelivery();

  public final void wrapGift() {
    System.out.println("Gift was wrapped");
  }

  public final void processOrder() {
    doCheckout();
    doPayment();

    if (isGift) {
      wrapGift();
    } else {
      doReceipt();
    }

    doDelivery();
  }
}
