package factoryMethod.document;

public class DocumentFactory {
    public static Application getApplication (String type) {
        switch(type) {
            case "drowing":
                return new DrowingApplication();
            case "calculator":
                return new CalculatorApplication();
            default:
                return null;
        }
    }
}