package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    // crear archivo
    public static void crearArchivo(String nombreArchivo) {
        // Crear objeto tipo File en memoria
        File archivo = new File(nombreArchivo);

        /**
         * PrintWriter clase usada para escribir cualquier tipo cualquier tipo
         * de data
         */
        try {
            // Abriendo el archivo
            PrintWriter salida = new PrintWriter(archivo);

            // Cuando se llama este metodo es cuando se crea el archivo en el Disco duro
            salida.close();

            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }

    // escribir en archivo
    public static void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {
            // Abriendo el archivo
            PrintWriter salida = new PrintWriter(archivo);

            // escribir en el archivo
            salida.println(contenido);

            // cerrar el flujo del archivo
            salida.close();

            System.out.println("Se ha escrito en el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
}
