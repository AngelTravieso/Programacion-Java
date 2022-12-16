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

        // si se llama dos veces se sobreescribe la informacion
//        escribirArchivo(nombreArchivo, "adios");
        // Agregar informacion al archivo sin perder el texto anterior
        anexarArchivo(nombreArchivo, "Hola desde Java yuju");
        anexarArchivo(nombreArchivo, "adios");
        anexarArchivo(nombreArchivo, "yes");

        // Leer informacion del archivo
        leerArchivo(nombreArchivo);

    }
}
