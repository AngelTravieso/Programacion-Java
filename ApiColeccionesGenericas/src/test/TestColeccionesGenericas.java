package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        // declarar tipo de lista generica
        List<String> miLista = new ArrayList<>(); // Lista

        // agregar datos a la lista, se puede agregar cualquier tipo Object
        // la lista guarda el orden en el que se agregan
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");

        // En las listas se pueden duplicar los elementos
        miLista.add("Viernes");
        miLista.add("Viernes");

        /*
        definiendo un tipo generico para la collections en java
        nos aseguramos de la compatibilidad en tiempo de ejecucion
        y no hace falta hacer el casting para obtener el elemento ya
        que se especifica un tipo y no se trabaja directamente como un
        tipo Object
         */
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
//        System.out.println("miLista = " + miLista);
        System.out.println("\n");

        // El set no garantiza que se mantenga el orden de los elementos
        // el set es mas rapido porque no maneja un orden
        // no se permiten elementos duplicados
        Set<String> miSet = new HashSet<>(); // Set

        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        // tomara el ultimo elemento repetido
        miSet.add("Domingo");

//        imprimir(miSet);
        // Declarar hashmap
        // son pares clave - valor
        Map<String, String> miMapa = new HashMap<>();

        // agregar elementos
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Hola");

        // si hay elementos repetidos los sustituye por el ultimo valor
        miMapa.put("valor3", "Carlos");

        String elementoMapa = miMapa.get("valor3");
        System.out.println("elementoMapa = " + elementoMapa);

        // Acceder al valor
        /*
        regresa un tipo object (downcast) hay que hacer casting
         */
//        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
        // Obtener todas las llaves del mapa
//        imprimir(miMapa.keySet());
        // Obtener todos los valores
//        imprimir(miMapa.values());
        // Obtener mapa completo (llave: valor)
//        imprimir(miMapa.entrySet());
    }

    // funcion generica (coleccion tipo string) para imprimir (polimorfismo)
    public static void imprimir(Collection<String> coleccion) {
//        for (String elemento : coleccion) {
//            System.out.println("elemento = " + coleccion);
//        }

        // funcion lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
