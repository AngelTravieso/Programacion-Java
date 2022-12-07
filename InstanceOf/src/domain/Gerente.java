package domain;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    /*
        Anotacion override, modifica el comportamiento del metodo definido
        posteriormente a esta anotacion, en este caso indica al compilador
        que el metodo esta siendo sobreescrito desde la clase padre
     */
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

}
