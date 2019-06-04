package factoryMethod.product;


public abstract class IFramework {
    protected Product product;

    public IFramework () {
        this.makeProduct();
    }

    public abstract void makeProduct();

    public Product getProduct() {
        return product;
    }
}