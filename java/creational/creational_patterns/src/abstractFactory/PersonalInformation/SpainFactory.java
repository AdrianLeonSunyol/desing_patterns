package abstractFactory.PersonalInformation;

public class SpainFactory extends PersonalInformation {

    @Override
    public Adress getAdress () {
        return new SpainAdress();
    }

    @Override
    public Phone getPhone () {
        return new SpainPhone();
    }
    
}