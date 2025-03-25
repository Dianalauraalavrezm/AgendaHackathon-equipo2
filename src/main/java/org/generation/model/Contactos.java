package org.generation.model;

// Administra nuestros datos de contactos
public class Contactos {

    /** Atributos **/
    private Integer index;
    private String nombre;
    private String apellido;
    private String telefono;

    /**Constructores**/
    public Contactos(Integer index, String nombre, String apellido, String telefono) {
        this.index = index;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    /**Getter y Setter**/
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**toString**/
    @Override
    public String toString() {
        return "Contactos{" +
                "index=" + index +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}// class contactos



