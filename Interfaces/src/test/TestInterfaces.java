package test;

import accesodatos.*;

public class TestInterfaces {

    public static void main(String[] args) {
        // no se puede instanciar clases abstractas
//        IAccesoDatos datos = new IAccesoDatos();

        IAccesoDatos datos = new ImplementacionMySql();
//            datos.listar();
//        imprimir(datos);

        datos = new ImplementacionOracle();
//        datos.listar();
        imprimir(datos);

    }

    // polimorfismo
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
