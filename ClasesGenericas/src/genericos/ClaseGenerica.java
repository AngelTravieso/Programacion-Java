package genericos;

// <T> para indicar que la clase recibira un tipo generico (Object)
public class ClaseGenerica<T> {

    // declarar tipo generico
    private T objeto;

    // inicializar atributo generico de la clase
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    // obtener tipo de la clase generica
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }

}
