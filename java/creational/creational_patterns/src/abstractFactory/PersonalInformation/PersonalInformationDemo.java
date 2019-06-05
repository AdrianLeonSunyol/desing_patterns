package abstractFactory.PersonalInformation;

public class PersonalInformationDemo {
    public static void main(String[] args) {
        System.out.println("Testing Abstract factory");

        PersonalInformation personal = PersonalInformation.getPersonalInformation(150);
        Adress adress = personal.getAdress();
        Phone phone = personal.getPhone();
        System.out.println(adress.getClass());
        System.out.println(phone.getClass());

        personal = PersonalInformation.getPersonalInformation(60);
        Adress adress2 = personal.getAdress();
        System.out.println(adress2.getClass());
    }
}