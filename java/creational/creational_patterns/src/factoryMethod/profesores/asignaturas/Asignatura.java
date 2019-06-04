package factoryMethod.profesores.asignaturas;

public class Asignatura {
    protected int id;
    protected String aula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}