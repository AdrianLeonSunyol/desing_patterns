package factoryMethod.profesores.profesores;
import factoryMethod.profesores.asignaturas.Asignatura;

import java.util.List;
import java.util.ArrayList;

public abstract class Profesor {
    protected List<Asignatura> asignaturas = new ArrayList<>();

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public Profesor () {
        this.createProfesor();
    }

    public abstract void createProfesor();
}