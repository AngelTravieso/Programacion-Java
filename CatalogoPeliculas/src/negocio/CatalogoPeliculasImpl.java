package negocio;

import java.io.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    public CatalogoPeliculasImpl() {

    }

    // Crear catalogo (crear archivo)
    @Override
    public void iniciarArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);

            salida.close();

            System.out.println("Catalogo creado");
        } catch (FileNotFoundException e) {
            // TODO error personalizado
            e.printStackTrace(System.out);

        }

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        System.out.println("Agregando pelicula...");
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

    }

    @Override
    public void buscarPelicula(String nombreArchivo) {

    }

}
