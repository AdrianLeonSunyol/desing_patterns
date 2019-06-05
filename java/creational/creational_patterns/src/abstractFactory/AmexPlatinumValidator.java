package abstractFactory;

public class AmexPlatinumValidator extends Validator {

    @Override
    public Boolean isValid(CreditCard creditCard) {
        return false;
    }

}