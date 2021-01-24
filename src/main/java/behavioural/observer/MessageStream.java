package behavioural.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

  private final Deque<String> messageHistory = new ArrayDeque<>();

  @Override
  void setState(String message) {
    messageHistory.add(message);
    this.notifyObservers();
  }

  @Override
  String getState() {
    return messageHistory.getLast();
  }
}
