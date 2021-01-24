package behavioural.state;

public class StateDemo {

  Fan fan = new Fan();

  public static void main(String[] args) {
    Fan fan = new Fan();

    System.out.println(fan);

    fan.pullChain();
    System.out.println(fan);

    fan.pullChain();
    System.out.println(fan);

    fan.pullChain();
    System.out.println(fan);

    fan.pullChain();
    System.out.println(fan);

    fan.pullChain();
  }

}
