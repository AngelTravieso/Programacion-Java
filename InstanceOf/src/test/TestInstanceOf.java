package test;

import domain.*;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);

        empleado = new Gerente("Karla", 10000, "Contabilidad");
//        determinarTipo(empleado);

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

            // casting para cambiar el tipo de la variable
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
//            ((Gerente) empleado).getDepartamento();

        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
            // ClassCastException
//            Gerente gerente = (Gerente) empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }

}
