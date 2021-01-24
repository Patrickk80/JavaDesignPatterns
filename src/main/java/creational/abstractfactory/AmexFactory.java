package creational.abstractfactory;

public class AmexFactory extends CreditCardFactory {


  @Override
  public CreditCard getCreditCard(CardType cardType) {
    return switch (cardType) {
      case GOLD -> new AmexGoldCreditCard();
      case PLATINUM -> new AmexPlatinumCreditCard();
    };
  }

  @Override
  public Validator getValidator(CardType cardType) {
    return switch (cardType) {
      case GOLD -> new AmexGoldValidator();
      case PLATINUM -> new AmexPlatinumValidator();
    };
  }
}
