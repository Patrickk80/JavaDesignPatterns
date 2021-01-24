package behavioural.mediator;

// reciever
public class Light {

  private boolean isOn = false;
  private String location;

  public Light(String location) {
    this.location = location;
  }

  public boolean isOn() {
    return isOn;
  }

  public void toggle() {
    if (isOn) {
      off();
    } else {
      on();
    }

    isOn = !isOn;
  }

  private void on() {
    System.out.println(location + " light switched on");
  }
  private void off() {
    System.out.println(location + " light switched off");
  }
}
