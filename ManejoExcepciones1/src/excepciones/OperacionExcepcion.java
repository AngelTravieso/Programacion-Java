package excepciones;

// Clase personalizada para manejar errores
public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion(String mensaje) {
        // propagar el mensaje de excepcion a la clase padre
        super(mensaje);
    }
}
