package negocio;

public interface ICatalogoPeliculas {

//    String NOMBRE_ARCHIVO = "peliculas.txt";
    public void agregarPelicula(String nombreArchivo, String nombrePelicula);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String nombreArchivo, String buscar);

    public void iniciarCatalogoPeliculas(String nombreArchivo);

}
