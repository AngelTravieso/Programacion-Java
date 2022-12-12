package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // declarar lista
        List miLista = new ArrayList();

        // agregar datos a la lista, se puede agregar cualquier tipo Object
        // la lista guarda el orden en el que se agregan
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

//        System.out.println("miLista = " + miLista);
        // iterar lista (foreach)
        // el elemento que se itera es de tipo Object
//        for(Object elemento : miLista) {
//            System.out.println(elemento);
//        }
        // funcion lambda
        // la variable sera del tipo que maneje la coleccion
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }
}
