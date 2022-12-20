package excepciones;

public class NumeroInvalidoEx extends RuntimeException {

    public NumeroInvalidoEx(String mensaje) {
        super(mensaje);
    }
}
