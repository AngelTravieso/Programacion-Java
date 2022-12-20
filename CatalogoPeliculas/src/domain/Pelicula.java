package domain;

public class Pelicula {

    private String nombre;

    public Pelicula() {

    }

    public Pelicula(String nombre) {
        this();
        this.nombre = nombre;
    }

    String getNombre() {
        return this.nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
