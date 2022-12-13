package test;

import genericos.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {
        // no se pueden usar tipos primitivos (int)
        // se debe usar la clave envolvente Integer
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();

        // se pueden usar subtipos como tipo en las clases genericas
    }
}
