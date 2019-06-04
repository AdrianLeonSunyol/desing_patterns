package factoryMethod.product;

public class ApplicationTwo extends IFramework {

    @Override
    public void makeProduct() {
        product = new ProductTwo();
    }

}