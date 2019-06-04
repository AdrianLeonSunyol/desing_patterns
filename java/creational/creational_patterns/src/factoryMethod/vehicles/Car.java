package factoryMethod.vehicles;

public class Car extends Vehicle {

    @Override
    public void createVehicle() {
        piezas.add(new Puerta());
        piezas.add(new Motor());
        piezas.add(new Rueda());
    }
}