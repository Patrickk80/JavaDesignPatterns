package structural.decorator;

public class DressingDecorator extends SandwichDecorator {

  public DressingDecorator(Sandwich customSandwich) {
    super(customSandwich);
  }

  @Override
  public String make() {
    return customSandwich.make() + addMustard();
  }

  String addMustard() {
    return " + mustard";
  }
}

