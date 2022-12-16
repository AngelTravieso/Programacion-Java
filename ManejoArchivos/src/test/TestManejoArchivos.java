package test;

// import statico
import static manejoarchivos.ManejoArchivos.*;

/**
 * Informacion util manejo archivos http://jmoral.es/blog/IO-java
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";

        // Crear archivo
        crearArchivo(nombreArchivo);

        // Escribir en el archivo creado previamente
        escribirArchivo(nombreArchivo, "Hola desde Java");

    }
}
