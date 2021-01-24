package behavioural.visitor;

public class Fender implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
