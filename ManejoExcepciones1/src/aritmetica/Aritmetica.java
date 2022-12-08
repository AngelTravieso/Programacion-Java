package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    // throws para indicar que el metodo posiblemente arroja una excepcion de tipo <T>
    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            // arrojar excepcion
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
