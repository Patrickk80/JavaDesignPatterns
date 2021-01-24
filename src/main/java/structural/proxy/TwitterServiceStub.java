package structural.proxy;

public class TwitterServiceStub implements TwitterService {

  @Override
  public String getTimeline(String screenName) {
    return "My neato timeline";
  }

  @Override
  public void postToTimeLine(String screenName, String message) {

  }
}
