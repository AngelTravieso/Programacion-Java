package test;

// importar metodo estatico
import static aritmetica.Aritmetica.division;

public class TextExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            
            // imprimir la pila de excepciones
            e.printStackTrace(System.out); // La salida se manda a consola
            
            // imprimir mensaje de error sin ver la pila de excepciones
            System.out.println(e.getMessage());
        }

        System.out.println("resultado = " + resultado);
    }
}
