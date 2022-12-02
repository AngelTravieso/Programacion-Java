package enumeracion;

public enum Continentes {
//    AFRICA(53, "1.2 billones"),
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // definir atributos para una enumeracion (propiedad encapsulada)
    private final int paises;
//    private final String poblacion;

    // String poblacion
    Continentes(int paises) {
        this.paises = paises;
//        this.poblacion = poblacion;
    }
    
    // getter para paises
    public int getPaises() {
        return this.paises;
    }

}
