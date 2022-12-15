package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

/**
 * Informacion util manejo archivos http://jmoral.es/blog/IO-java
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "C::\\carpetaprueba.txt";

        // Crear archivo
        crearArchivo(nombreArchivo);

    }
}
