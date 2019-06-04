package factoryMethod.document;

public class DrowingApplication extends Application {

    @Override
    public Document createDocument() {
        return new DrowingDocument();
    }
}