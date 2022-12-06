package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
         
        // foreach
        for(int edad: edades) {
            System.out.println("edades: " + edad);
        }
        
        Persona personas[] = {new Persona("Angel"), new Persona("Gustavo"), new Persona("Maria")};
        
        for(Persona persona: personas) {
            System.out.println(persona);
        }
        
    }
}
