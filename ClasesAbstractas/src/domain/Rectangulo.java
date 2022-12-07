package domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    // con esto implementamos el metodo de la clase padre, override (opcional)
    @Override
    public void dibujar() {
        System.out.println("Se imprime un : " + this.getClass().getSimpleName());
    }
}
