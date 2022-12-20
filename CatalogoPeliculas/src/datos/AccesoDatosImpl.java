package datos;

import domain.Pelicula;
import excepciones.*;
import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    // Verificar si el archivo existe
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);

        return archivo.exists();
    }

    // Listar peliculas agregadas
    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);

        List<Pelicula> peliculas = new ArrayList<>();

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;

            linea = entrada.readLine();

            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }

            // cerrar flujo
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }

        return peliculas;

    }

    // Escribir en el archivo
    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));

            // escribir pelicula en el archivo
            salida.println(pelicula.toString());

            // cerrar el flujo del archivo
            salida.close();

            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);

        try {
            var entrada = new BufferedReader(new FileReader(archivo));

            var lectura = entrada.readLine();

            while (lectura != null) {
                if(lectura.contains(buscar)) {
                    
                }
                
                lectura = entrada.readLine();
            }

            // cerrar flujo del archivo
            entrada.close();

        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + ex.getMessage());
        }

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

    }

}
