package behavioural.chainofresponsability;

public class ChainOfResponsibilityDemo {

  public static void main(String[] args) {
    Director patrick = new Director();
    VP crystal = new VP();
    CEO jeff = new CEO();

    patrick.setSuccessor(crystal);
    crystal.setSuccessor(jeff);

    patrick.handleRequest(new Request(RequestType.CONFERENCE));
    patrick.handleRequest(new Request(RequestType.PURCHASE, 1000));
    patrick.handleRequest(new Request(RequestType.PURCHASE, 2000));
  }

}
