package abstractFactory.PersonalInformation;

public abstract class PersonalInformation {
    public static PersonalInformation getPersonalInformation (int CodCountry) {
        return (CodCountry > 100)
            ? new SpainFactory()
            : new CubaFactory();
    }

    public abstract Phone getPhone ();
    public abstract Adress getAdress (); 
}