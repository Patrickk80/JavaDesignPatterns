package behavioural.chainofresponsability;

public class VP extends Handler {

  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType().equals(RequestType.PURCHASE) && request.getAmount() < 1500) {
      System.out.println("VP's can approve purchases below 1500");

    } else {
      successor.handleRequest(request);
    }
  }
}
