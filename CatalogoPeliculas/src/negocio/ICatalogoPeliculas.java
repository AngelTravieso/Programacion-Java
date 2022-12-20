package negocio;

public interface ICatalogoPeliculas {

    public void iniciarArchivo(String nombreArchivo);

    public void agregarPelicula(String nombrePelicula, String nombreArchivo);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String nombreArchivo);

}
