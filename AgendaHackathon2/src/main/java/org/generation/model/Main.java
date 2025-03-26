package org.generation.model;

import org.generation.service.AgendaService;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {


    public static void main(String[] args) {
        Agenda agenda = new Agenda();  // Crear la agenda
        AgendaService agendaService = new AgendaService(agenda);  // Crear el servicio de agenda
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Lista de Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Modificar Teléfono");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();
            scanner.nextLine();  // Para consumir el salto de línea

            switch (opcion) {
                case "1":
                    System.out.println("Haz seleccionado 'Agregar un contacto'.");
                    agendaService.agregarContacto();
                    System.out.println("Aún quedan " + agenda.espaciosLibres() + " espacios disponibles.");
                    esperarSegundos(2);
                    break;
                case "2":
                    System.out.println("Haz seleccionado 'Lista de Contactos'.");
                    agendaService.listarContactos();
                    System.out.println("Aún quedan " + agenda.espaciosLibres() + " espacios disponibles.");
                    esperarSegundos(5);
                    break;
                case "3":
                    System.out.println("Haz seleccionado 'Buscar Contacto'.");
                    agendaService.buscarContacto();
                    System.out.println("Aún quedan " + agenda.espaciosLibres() + " espacios disponibles.");
                    esperarSegundos(5);
                    break;
                case "4":
                    System.out.println("Haz seleccionado 'Eliminar Contacto'.");
                    agendaService.eliminarContacto();
                    System.out.println("Aún quedan " + agenda.espaciosLibres() + " espacios disponibles.");
                    esperarSegundos(2);
                    break;
                case "5":
                    System.out.println("Haz seleccionado 'Modificar Teléfono'.");
                    agendaService.modificarTelefono();
                    System.out.println("Aún quedan " + agenda.espaciosLibres() + " espacios disponibles.");
                    esperarSegundos(2);
                    break;
                case "6":
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }


    }

    public static void esperarSegundos(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Se interrumpió la pausa.");
        }


    }
}
