package factoryMethod.profesores.profesores;

import factoryMethod.profesores.asignaturas.PED;

public class Interino extends Profesor {

    @Override
    public void createProfesor() {
        asignaturas.add(new PED());
    }
}