package abstractFactory;

public class AmexGoldValidator extends Validator {

    @Override
    public Boolean isValid(CreditCard creditCard) {
        return false;
    }
    
}