package org.generation.model;

import org.generation.excepciones.AgendaLlenaException;

import java.util.ArrayList;

public class Agenda {
    private static final int maxContactos = 10;
    private ArrayList<Contactos> contactos; // Aquí almacenaremos los contactos

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    // Metodo para agregar un contacto
    public void agregarContacto(Contactos contacto) {
        contactos.add(contacto);
    }

    // Metodo para listar todos los contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            for (Contactos contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    // Metodo para buscar un contacto por nombre
    public Contactos buscarContacto(String nombre) {
        for (Contactos contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null; // Si no lo encuentra, retorna null
    }

    // Metodo para eliminar un contacto
    public boolean eliminarContacto(String nombre) {
        Contactos contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
            return true; // El contacto fue eliminado
        }
        return false; // El contacto no se encontró
    }

    // Metodo para modificar el teléfono de un contacto
    public boolean modificarTelefono(String nombre, String nuevoTelefono) {
        Contactos contacto = buscarContacto(nombre);
        if (contacto != null) {
            contacto.setTelefono(nuevoTelefono);
            return true; // Teléfono modificado
        }
        return false; // Contacto no encontrado
    }

    // Metodo para verificar si la agenda está llena
    public boolean agendaLlena() throws AgendaLlenaException {
        if (contactos.size() >= maxContactos) {
            throw new AgendaLlenaException("La agenda está llena. No hay espacio disponible para nuevos contactos.");
        }
        return false;
    }

    // Metodo para mostrar cuántos espacios libres hay
    public int espaciosLibres() {
        return maxContactos - contactos.size();
    }


}
