package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    /**
     * Bloque de inicializacion estatico, este bloque se ejecuta antes del
     * constructor y tambien antes de cualquier bloque de inicializacion no
     * estático, se ejecuta la 1era cuando se carga la clase en memoria
     */
    static {
        System.out.println("Ejecucion bloque estatico");

        // podemos acceder a variables estaticas
        ++Persona.contadorPersonas;
        // no puede ser referenciada desde un contexto estatico
//        idPersona = 10;
    }

    /**
     * Bloque de inicializacion no estatico, se ejecuta antes del constructor se
     * ejecuta cada vez que se crea un objeto
     *
     */
    {
        System.out.println("ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
