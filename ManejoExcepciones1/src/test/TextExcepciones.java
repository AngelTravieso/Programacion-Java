package test;

// importar metodo estatico
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TextExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);

            // para procesar varias excepciones
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception: ");

            // imprimir la pila de excepciones
            e.printStackTrace(System.out); // La salida se manda a consola

            // imprimir mensaje de error sin ver la pila de excepciones
            System.out.println(e.getMessage());

            // siempre se ejecuta este bloque, ocurra o no alguna excepcion
        } finally {
            System.out.println("Se reviso la division entre cero");
        }

        System.out.println(
                "resultado = " + resultado);
    }
}
