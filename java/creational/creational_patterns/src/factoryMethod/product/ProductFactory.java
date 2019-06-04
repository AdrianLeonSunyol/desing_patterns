package factoryMethod.product;

public class ProductFactory {
    public static IFramework getInstance (String type) {
        switch(type) {
            case "one" : 
                return new ApplicationOne();
            case "two" :
                return new ApplicationTwo();
            default:
                return null;
        }
    }
}