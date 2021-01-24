package behavioural.strategy;

public class StrategyDemo {

  public static void main(String[] args) {
    CreditCard amexCard = new CreditCard(new AmexStrategy());

    amexCard.setNumber("340000000000009");
    amexCard.setDate("04/2020");
    amexCard.setCvv("123");

    System.out.println("Is Amex valid: " + amexCard.isValid());

    CreditCard amexCard2 = new CreditCard(new AmexStrategy());

    amexCard2.setNumber("3400000000000092");
    amexCard2.setDate("04/2020");
    amexCard2.setCvv("123");

    System.out.println("Is Amex2 valid: " + amexCard2.isValid());

    CreditCard visaCard = new CreditCard(new VisaStrategy());

    visaCard.setNumber("4111111111111111");
    visaCard.setDate("04/2020");
    visaCard.setCvv("123");

    System.out.println("Is visa valid: " + visaCard.isValid());
  }
}
