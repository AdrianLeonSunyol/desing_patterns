package factoryMethod.profesores;

import factoryMethod.profesores.profesores.Cientifico;
import factoryMethod.profesores.profesores.Fijo;
import factoryMethod.profesores.profesores.Interino;
import factoryMethod.profesores.profesores.Profesor;
import factoryMethod.profesores.profesores.ProfesorType;
import factoryMethod.profesores.profesores.Visitante;

public class ProfesorFactory {
    public static Profesor getProfesor (ProfesorType type) {
        switch (type) {
            case CIENTIFICO:
                return new Cientifico();
            case INTERINO:
                return new Interino();
            case VISITANTE:
                return new Visitante();
            case FIJO:
                return new Fijo();
            default:
                return null;
        }
    }
}