package behavioural.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

  double shippingAmount = 0;

  @Override
  public void visit(Fender fender) {
    shippingAmount += 3;
    System.out.println("Fenders are light and cheap to ship");
  }

  @Override
  public void visit(Wheel wheel) {
    shippingAmount += 15;
    System.out.println("Wheels are bulky and expensive to ship");
  }

  @Override
  public void visit(Oil oil) {
    shippingAmount += 9;
    System.out.println("Oil is hazardous and has a fee to ship");
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    System.out.println("If they bought more than 3 items we will give them a shipping discount");
    List<AtvPart> parts = partsOrder.getParts();
    if (parts.size() > 3) {
      shippingAmount -= 5;
    }
    System.out.println("Shipping amount is: " + shippingAmount);
  }
}
