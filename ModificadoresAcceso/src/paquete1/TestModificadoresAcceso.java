package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1("Publico");

//        System.out.println("clase1 = " + clase1.atributoPublico);
//        clase1.metodoPublico();
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);
        Clase1 clase1 = new Clase1("publico");
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("atributoDefault: " + clase1.atributoDefault);
//        clase1.metodoDefault();

        clase1.setAtributoPrivado("cambio valor atributo");

        System.out.println("clase1 = " + clase1.getAtributoPrivado());

    }
}
