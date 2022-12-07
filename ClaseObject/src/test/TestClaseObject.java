package test;

import domain.*;

public class TestClaseObject {

    public static void main(String[] args) {
        // con new se crea una diferente referencia en memoria
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        // verificar si los objetos son iguales por su contenido con equals
        /*
            equals compara no solo la referencia del objeto, sino tambien
            el contenido
        */
        if(empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hashcode es distinto");
        }
    }
}
