package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // declarar lista
        List miLista = new ArrayList(); // Lista

        // agregar datos a la lista, se puede agregar cualquier tipo Object
        // la lista guarda el orden en el que se agregan
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");

        // En las listas se pueden duplicar los elementos
        miLista.add("Viernes");
        miLista.add("Viernes");
//        imprimir(miLista);

//        System.out.println("miLista = " + miLista);
        System.out.println("\n");

        // El set no garantiza que se mantenga el orden de los elementos
        // el set es mas rapido porque no maneja un orden
        // no se permiten elementos duplicados
        Set miSet = new HashSet(); // Set

        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        // tomara el ultimo elemento repetido
        miSet.add("Domingo");

//        imprimir(miSet);
        // Declarar hashmap
        // son pares clave - valor
        Map miMapa = new HashMap();

        // agregar elementos
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", 1234);

        // Acceder al valor
        /*
        regresa un tipo object (downcast) hay que hacer casting
         */
        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);

        // Obtener todas las llaves del mapa
        imprimir(miMapa.keySet());
        
        // Obtener todos los valores
        imprimir(miMapa.values());
        
        // Obtener mapa completo (llave: valor)
        imprimir(miMapa.entrySet());

    }

    // funcion generica para imprimir (polimorfismo)
    public static void imprimir(Collection coleccion) {
        //        for(Object elemento: coleccion) {
        //            System.out.println("elemento = " + coleccion);
        //        }

        // funcion lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
