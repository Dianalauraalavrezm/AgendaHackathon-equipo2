package org.generation.service;

import org.generation.excepciones.AgendaLlenaException;
import org.generation.model.Agenda;
import org.generation.model.Contactos;
import java.util.Scanner;

public class AgendaService {
    private Agenda agenda;
    private Scanner scanner;

    public AgendaService(Agenda agenda) {
        this.agenda = agenda;
        this.scanner = new Scanner(System.in);
    }

    // Metodo para agregar un contacto
    public void agregarContacto() {
        try {
            agenda.agendaLlena();
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del contacto: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el teléfono del contacto: ");
            String telefono = scanner.nextLine();

            Contactos nuevoContacto = new Contactos(nombre, apellido, telefono);
            agenda.agregarContacto(nuevoContacto);
            System.out.println("Contacto agregado con éxito.");
        } catch (AgendaLlenaException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodo para listar todos los contactos
    public void listarContactos() {
        agenda.listarContactos();
    }

    // Metodo para buscar un contacto
    public void buscarContacto() {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine();
        Contactos contacto = agenda.buscarContacto(nombre);
        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Metodo para eliminar un contacto
    public void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        boolean eliminado = agenda.eliminarContacto(nombre);
        if (eliminado) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("El contacto no se encuentra en la agenda.");
        }
    }

    // Metodo para modificar el teléfono de un contacto
    public void modificarTelefono() {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo teléfono: ");
        String nuevoTelefono = scanner.nextLine();
        boolean modificado = agenda.modificarTelefono(nombre, nuevoTelefono);
        if (modificado) {
            System.out.println("Teléfono modificado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Metodo para verificar si la agenda está llena
    public void agendaLlena() throws AgendaLlenaException {
        if (agenda.agendaLlena()) {
            throw new AgendaLlenaException("La agenda está llena. No se pueden agregar más contactos.");
        }
    }


}