package structural.bridge.shape2;

public class Shape2BrideDemo {

  public static void main(String[] args) {

    Color blue = new Blue();
    Color green = new Green();

    Shape square = new Square(blue);
    square.applyColor();;

    Shape greenSquare = new Square(green);
    greenSquare.applyColor();

    Shape circle = new Circle(blue);
    circle.applyColor();
  }
}
