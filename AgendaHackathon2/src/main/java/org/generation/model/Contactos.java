package org.generation.model;

public class Contactos {
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor para crear un contacto
    public Contactos(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Metodos getter y setter
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono;
    }
}




