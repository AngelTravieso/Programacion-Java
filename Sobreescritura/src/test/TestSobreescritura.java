package test;

import domain.*;
import domain.Gerente;

public class TestSobreescritura {

    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Angel", 5000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());

        imprimir(empleado);

        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("gerente = " + gerente.obtenerDetalles());

        imprimir(gerente);

    }
    
    /*
        polimorfismo, cambia el comportamiento segun el objeto que se
        pasa como referencia
    */
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }

}
