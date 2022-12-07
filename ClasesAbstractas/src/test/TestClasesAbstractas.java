package test;

import domain.*;

public class TestClasesAbstractas {

    public static void main(String[] args) {
        // No se puede instanciar una clase abstracta
//        FiguraGeometrica figura = new FiguraGeometrica() {};

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
