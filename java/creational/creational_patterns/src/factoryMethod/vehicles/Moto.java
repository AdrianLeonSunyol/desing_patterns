package factoryMethod.vehicles;

public class Moto extends Vehicle {

    @Override
    public void createVehicle() {
        piezas.add(new Rueda());
        piezas.add(new Cadena());
        piezas.add(new Piston());
    }
}