package cpjlaboratoriofinal;

import constants.Constantes;
import excepciones.NumeroInvalidoEx;
import java.io.File;
import java.util.*;
import negocio.*;

public class CPJLaboratorioFinal {

    static String nombreArchivo = null;
    static ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
    static Scanner scanner = new Scanner(System.in);
    static String catalogoPeliculas = null;

    public static void main(String[] args) {

        int opcion = 0;

        do {
            // imprimir menu de opciones
            imprimirMenu();
            try {
                // guardar opcion del usuario
                opcion = scanner.nextInt();

                switch (opcion) {
                    // Salir del Catalogo de peliculas (0)
                    case Constantes.SALIR:
                        System.out.println("Has cerrado el catalogo");
                        // cerrar consola
                        System.exit(0);
                        break;
                    // Crear catalogo (1)
                    case Constantes.INICIAR:
                        iniciar();
                        break;
                    // Agregar pelicula (al archivo ya creado) (2)
                    case Constantes.AGREGAR:
                        agregar();
                        break;
                    // Listar peliculas (3)
                    case Constantes.LISTAR:
                        listar();
                        break;
                    // Buscar pelicula en archivo (4)
                    case Constantes.BUSCAR:
                        buscar();
                        break;
                    // Opcion no valida (cualquier digito ingresado por el usuario)
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } catch (InputMismatchException ex) {
                ex.printStackTrace(System.out);
                // mensaje de error personalizado
                throw new NumeroInvalidoEx("Ingresa una opcion valida");
            }

        } while (opcion < 0 || opcion != 0);

    }

    // iniciar/crear catalogo
    public static void iniciar() {
        // limpiar consola
        limpiarConsola();

        System.out.print("Nombre de catalogo: ");

        // nombre archivo
        nombreArchivo = String.format("%s.txt", scanner.next());

        catalogo.iniciarCatalogoPeliculas(nombreArchivo);

    }

    // agregar pelicula a un catalogo
    public static void agregar() {

        // limpiar consola
        limpiarConsola();

        System.out.print("Ingresa el nombre de la pelicula: ");

        // nombre de pelicula
        String nombrePelicula = scanner.next();

        catalogo.agregarPelicula(
                nombrePelicula,
                nombreArchivo
        );
    }

    // listar peliculas de un catalogo en especifico
    public static void listar() {
        // limpiar consola
        limpiarConsola();

        System.out.print("Ingresa el nombre del catalogo: ");

        catalogoPeliculas = String.format("%s.txt\n", scanner.next());

        System.out.println("Listando peliculas...");

        catalogo.listarPeliculas(catalogoPeliculas);
    }

    // buscar pelicula
    public static void buscar() {
        // limpiar consola
        limpiarConsola();

        System.out.print("Ingresa el catalogo donde buscar: ");

        catalogoPeliculas = String.format("%s.txt", scanner.next());

        System.out.print("¿Que pelicula buscas?: ");

        String pelicula = scanner.next();

        System.out.println("Buscando...");

        catalogo.buscarPelicula(catalogoPeliculas, pelicula);
    }

    // imprimir menu de opciones
    public static void imprimirMenu() {
        System.out.println("----- Catalogo de Peliculas -----\n");

        System.out.println("\t1.- Iniciar catalogo de peliculas");
        System.out.println("\t2.- Agregar pelicula");
        System.out.println("\t3.- Listar peliculas");
        System.out.println("\t4.- Buscar peliculas");
        System.out.println("\t0.- Salir");

        System.out.print("\n Opcion: ");
    }

    // limpiar consola
    public static void limpiarConsola() {
        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
