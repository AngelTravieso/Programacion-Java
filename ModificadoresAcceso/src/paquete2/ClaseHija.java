package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija() {
        // llamar constructor privado de la super clase (clase padre)
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributoProtegido: " + this.atributoProtected);
        this.metodoProtected();
    }
}
