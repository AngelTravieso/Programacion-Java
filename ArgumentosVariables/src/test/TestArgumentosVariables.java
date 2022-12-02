package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        // argumentos variables en java (varargs)
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Angel", 8, 9, 10);
    }
    
    /**
     * cuando se tienen varios argumentos el varargs (argumento variable)
     * debe ser el ultimo argumento pasado, marca un error si esto no se
     * cumple
     */
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
      
    // metodo que recibe argumentos variables
    private static void imprimirNumeros (int... numeros) {
        // la variables numeros se convierte en un arreglo
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
