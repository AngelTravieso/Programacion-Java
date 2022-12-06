package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        // Clases Envolventes (wrapper)  de tipos primitivos
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Character
            short - Short
        */
        
        
        // Autoboxing, se envuelve el tipo primitivo en un tipo object
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());

        // Unboxing, del objeto que almacena la literal se le extrae el valor de 10
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
    }

}
