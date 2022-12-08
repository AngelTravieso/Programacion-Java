package accesodatos;

public interface IAccesoDatos {

    // todas las propiedades en interfaces son constantes (public, final y static)
    int MAX_REGISTRO = 10;

    // el metodo se define sin cuerpo
    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
