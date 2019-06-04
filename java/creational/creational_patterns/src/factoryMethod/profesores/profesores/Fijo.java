package factoryMethod.profesores.profesores;

import factoryMethod.profesores.asignaturas.GPI;

public class Fijo extends Profesor {

    @Override
    public void createProfesor() {
        asignaturas.add(new GPI());
    }
}