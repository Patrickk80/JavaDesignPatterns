package behavioural.mediator;

import static java.awt.Toolkit.getDefaultToolkit;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {

  private Timer timer;

  public MediatorEverydayDemo(int seconds) {
    System.out.println("started");
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000L);
    timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000L);
  }

  class RemindTask extends TimerTask {
    @Override
    public void run() {
      getDefaultToolkit().beep();
      System.out.println("Time is up");
    }
  }

  class RemindTaskWithoutBeep extends TimerTask {
    @Override
    public void run() {
      System.out.println("Now time is really up");
      timer.cancel();
    }
  }

  public static void main(String[] args) {
    new MediatorEverydayDemo(3);
  }
}
