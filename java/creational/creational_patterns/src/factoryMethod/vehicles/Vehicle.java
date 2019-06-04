package factoryMethod.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected List<Pieza> piezas = new ArrayList<>();

    public List<Pieza> getPiezas() {
        return piezas;
    }

    public Vehicle () {
        this.createVehicle();
    }

    public abstract void createVehicle();
}