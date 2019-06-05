package abstractFactory.PersonalInformation;

public class CubaFactory extends PersonalInformation {
    @Override
    public Adress getAdress() {
        return new CubaAdress();
    }

    @Override
    public Phone getPhone() {
        return new CubaPhone();
    }
    
}