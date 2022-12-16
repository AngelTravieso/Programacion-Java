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

    // agregar informacion al archivo (evita sustitucion)
    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            /*
            escribir en un archivo, [nombre del archivo, append (para agregar mas informacion y no sustituir)
             */
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true)); // puede arrojar excepcion (se llama IOException)

            // escribir en el archivo
            salida.println(contenido);

            // cerrar el flujo del archivo
            salida.close();

            System.out.println("Se ha anexado informacion en el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        // se puede inferir el tipo
        var archivo = new File(nombreArchivo);

        /*
        con esto se lee la informacion del archivo, buffer quiere decir que podemos leer
        lineas completas del archivo
         */
        try {
            var entrada = new BufferedReader(new FileReader(archivo));

            // leer lineas completas
            var lectura = entrada.readLine(); // esto solo leera la primera linea
            
            // debe usarse un while para leer todo el archivo
            while(lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            
            // cerrar flujo
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
