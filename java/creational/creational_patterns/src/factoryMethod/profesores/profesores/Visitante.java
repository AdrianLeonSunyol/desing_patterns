package factoryMethod.profesores.profesores;

import factoryMethod.profesores.asignaturas.ADA;

public class Visitante extends Profesor {

    @Override
    public void createProfesor() {
        asignaturas.add(new ADA());
    }
}