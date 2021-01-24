package behavioural.command;

// reciever
public class Light {

  private boolean isOn = false;

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
    System.out.println("Light switched on");
  }
  private void off() {
    System.out.println("Light switched off");
  }
}
