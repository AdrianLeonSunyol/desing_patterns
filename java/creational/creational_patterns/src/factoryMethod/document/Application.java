package factoryMethod.document;

public abstract class Application {
    protected Document doc;
    public abstract Document createDocument();//factory method
    
    public void newDocument () {//an operation
        doc = createDocument();
    }
    public void openDocument () {
        System.out.println("open document");        
    }
    public void saveDocument () {
        System.out.println("save document");
    }

    public Document getDoc() {
        return doc;
    }
}