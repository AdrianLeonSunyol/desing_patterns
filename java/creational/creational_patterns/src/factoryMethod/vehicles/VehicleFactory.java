package factoryMethod.vehicles;

public class VehicleFactory {
    public static Vehicle getInstance (String subType) {
        switch(subType) {
            case "car" :
                return new Car();
            case "moto" :
                return new Moto();
            default:
                return null;
        }
    }
}