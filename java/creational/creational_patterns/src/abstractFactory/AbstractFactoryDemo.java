package abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        
        System.out.println(card.getClass());
        System.out.println(abstractFactory);

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());
        System.out.println(abstractFactory);

        Validator vali1 = abstractFactory.getValidator(CardType.GOLD);
        System.out.println(vali1.getClass());
    }
}