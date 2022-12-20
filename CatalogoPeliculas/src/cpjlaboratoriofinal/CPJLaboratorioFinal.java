package cpjlaboratoriofinal;

import constants.Constantes;
import excepciones.NumeroInvalidoEx;
import java.util.*;
import negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String nombreArchivo = null;
        CatalogoPeliculasImpl catalogoPeliculas = new CatalogoPeliculasImpl();

        do {

            System.out.println("----- Catalogo de Peliculas -----\n");

            System.out.println("\t1.- Iniciar catalogo de peliculas");
            System.out.println("\t2.- Agregar pelicula");
            System.out.println("\t3.- Listar peliculas");
            System.out.println("\t4.- Buscar peliculas");
            System.out.println("\t0.- Salir");

            System.out.print("\n Opcion: ");

            try {
                // guardar opcion del usuario
                opcion = scanner.nextInt();

                switch (opcion) {
                    // Salir del Catalogo de peliculas (0)
                    case Constantes.SALIR:
                        System.out.println("Has cerrado el catalogo");
                        break;
                    // Crear catalogo (1)
                    case Constantes.INICIAR:
                        System.out.print("Nombre de catalogo: ");

                        // nombre archivo
                        nombreArchivo = String.format("%s.txt", scanner.next());

                        catalogoPeliculas.iniciarArchivo(nombreArchivo);
                        break;
                    // Agregar pelicula (al archivo ya creado) (2)
                    case Constantes.AGREGAR:

                        System.out.println("Nombre de pelicula: ");

                        // nombre de pelicula
                        String nombrePelicula = scanner.next();

                        catalogoPeliculas.agregarPelicula(
                                nombrePelicula,
                                nombreArchivo
                        );

                        break;
                    case Constantes.LISTAR:
                        System.out.println("Listando peliculas...");
                        break;
                    case Constantes.BUSCAR:
                        System.out.println("Buscando...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Ingresa una opcion valida");
                // mensaje de error personalizado
                throw new NumeroInvalidoEx("Ingresa una opcion valida");
            }

        } while (opcion < 0 && opcion != 0);

    }
}
