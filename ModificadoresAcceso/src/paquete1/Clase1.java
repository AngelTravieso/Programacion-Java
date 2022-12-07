package paquete1;

class Clase1 {
//    public String atributoPublico = "Valor atributo publico";
//    protected String atributoProtected = "Valor atributo protected";

    /**
     * en ausencia de modificador de acceso este es default o package y solo se
     * puede acceder desde el mismo paquete
     */
//    String atributoDefault = "Valor atributo default";
    
    private String atributoPrivado = "Valor atributo privado";

//    public Clase1() {
//        System.out.println("Constructor Publico");
//    }
//    protected Clase1() {
//        System.out.println("Constructor protected");
//    }
//    Clase1() {
//        System.out.println("Constructor default");
//    }
    
    private Clase1() {
        System.out.println("Constructor privado");
    }
    
    public Clase1(String args) {
        // llamar constructor privado
        this();
        System.out.println("Constructor publico");
    }

//    public Clase1(String arg) {
//        System.out.println("Constructor publico");
//    }
//    public void metodoPublico() {
//        System.out.println("Metodo publico");
//    }
//    protected void metodoProtected() {
//        System.out.println("Metodo protected");
//    }
//    void metodoDefault() {
//        System.out.println("Metodo default");
//    }
    
    private void metodoPrivado() {
        System.out.println("Meotodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    

}
