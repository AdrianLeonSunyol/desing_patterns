package factoryMethod.product;

public class ApplicationOne extends IFramework {

    @Override
    public void makeProduct() {
        product = new ProductOne();
    }
}