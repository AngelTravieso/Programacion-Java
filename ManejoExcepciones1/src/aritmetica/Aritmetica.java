package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    // throws para indicar que el metodo posiblemente arroja una excepcion de tipo <T>
    // RunTimeException no obliga a especificar el tipo de exception (throws)
    public static int division(int numerador, int denominador) {
        if (denominador == 0) {
            // arrojar excepcion
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
