package domain;

import java.io.Serializable;
import java.util.Objects;

// Declaracion de Java Bean
// 1. Java Bean debe implementar la interface Serializable
public class Persona implements Serializable {

    // 2. Los atributos deben ser privados
    private String nombre;
    private String apellido;

    // 3. Debe tener un constructor vacio
    public Persona() {

    }

    // Puede tener mas de un constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // 4. Getter y Setter para su respectiva propiedad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Los metodos toString, hashCode y equals son opcionales

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

}
