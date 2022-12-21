package negocio;

import datos.*;
import domain.Pelicula;
import excepciones.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    // Capa de datos (acceso al archivo)
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    // Agregar pelicula
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {

        // Inicializar objeto pelicula con el @nombrePelicula recibido
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {
            // Verificar si existe el archivo antes de hacer operaciones con el
            anexar = datos.existe(nombreArchivo);

            // Escribir en el archivo
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de acceso a datos: " + ex.getMessage());

        }

    }

    // Listar pelicula
    @Override
    public void listarPeliculas(String nombreArchivo) {

        try {
            var peliculas = this.datos.listar(nombreArchivo);

            // imprimir listado de peliculas (lambda)
            peliculas.forEach(pelicula -> {
                System.out.println(pelicula + "\n");
            });

            // capturar error de tipo más generico (opciona)
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de acceso a datos: " + ex.getMessage());
        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;

        try {
            // Obtener busqueda en el archivo (resultado y posicion/linea)
            resultado = this.datos.buscar(nombreArchivo, buscar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de acceso a datos: " + ex.getMessage());
        }

        // Imprimir resultado de busqueda (null si no hay resultado)
        System.out.println(String.format("%s: ", resultado));

    }

    // Crear catalogo (crear archivo)
    @Override
    public void iniciarCatalogoPeliculas(String nombreArchivo) {

        try {
            // verificar si existe el archivo
            if (this.datos.existe(nombreArchivo)) {
                // si ya existe borro el archivo
                this.datos.borrar(nombreArchivo);

                // lo vuelvo a crear
                this.datos.crear(nombreArchivo);

            } else {
                // crear el archivo
                this.datos.crear(nombreArchivo);
            }

            /*
            Los metodos anteriores pueden arrojar excepciones
            pero al capturarlas con la clase padre de excepciones no hace
            falta capturar todas
             */
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error al iniciar al catalogo de peliculas: " + ex.getMessage());
        }

    }

}
