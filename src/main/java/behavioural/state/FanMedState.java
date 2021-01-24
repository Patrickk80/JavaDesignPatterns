package behavioural.state;

public class FanMedState extends State {

  private Fan fan;

  public FanMedState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    System.out.println("Turning fan to high");
    fan.setState(fan.getFanHighState());
  }

  @Override
  public String toString() {
    return "Fan is med";
  }
}
