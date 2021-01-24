package structural.bridge.shape2;

public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  protected void applyColor() {
    this.color.applyColor();
  };
}
