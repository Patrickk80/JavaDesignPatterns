package structural.proxy;

public class TwitterDemo {

  public static void main(String[] args) {
    TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

    System.out.println(service.getTimeline("Patrickk80"));

    service.postToTimeLine("Patrickk80", "Some message that shouldn't go through");
  }
}
