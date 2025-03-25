package org.generation.metodos;

import java.util.ArrayList;
import java.util.Scanner;
import org.generation.model.Contactos;

public class AgendaService {
    private Scanner scanner;
    private ArrayList<Contactos> contactos;
    private static final int LimiteContacto = 10;

    /** Constructor **/
    public AgendaService() {
        this.scanner = new Scanner(System.in);
        this.contactos = new ArrayList<>();
    }

    /** Registrar Contacto **/
    public void registrarContacto() {
        // Limite de contactos
        if (contactos.size() >= LimiteContacto) {
            System.out.println("Almacenamiento lleno. No se pueden agregar más contactos.");
            return;
        }

        /** Solicitar los Datos **/
        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();

        // Verificar si el contacto existe
        if (existeContacto(nombre, apellido)) {
            System.out.println("Este contacto ya está registrado");
            return;
        }

        // Crear nuevo contacto y agregarlo a la lista
        int nuevoIndex = contactos.size() + 1;
        Contactos nuevoContacto = new Contactos(nuevoIndex, nombre, apellido, telefono);
        contactos.add(nuevoContacto);

        System.out.println("Contacto agregado con éxito: " + nuevoContacto);
    }

    /** Verificar si el contacto ya existe **/
    public boolean existeContacto(String nombre, String apellido) {
        for (Contactos contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre) &&
                    contacto.getApellido().equalsIgnoreCase(apellido)) {
                return true;  // Ya existe el contacto
            }
        }
        return false;  // El contacto no existe
    }



}
