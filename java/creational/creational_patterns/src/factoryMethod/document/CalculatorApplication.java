package factoryMethod.document;

public class CalculatorApplication extends Application {

    @Override
    public Document createDocument() {
        return new CalculatorDocument();
    }  
}