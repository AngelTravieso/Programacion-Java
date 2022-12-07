package test;

import domain.*;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
//        determinarTipo(empleado);

        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {
        /*
            instanceOf sirve para verificar la referencia en memoria de
            una variable, es decir, verificar si su instancia es de un
            tipo en especifico, esto solo sirve para datos de tipo Object
            y no primivitos, se recomienda preguntar desde la clase menos
            generica, clases hijas primeros y así sucesivamente
        */
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
        } else if(empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if(empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
