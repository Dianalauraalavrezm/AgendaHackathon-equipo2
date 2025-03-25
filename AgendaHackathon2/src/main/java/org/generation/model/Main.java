package org.generation.model;

import java.util.Scanner;
import org.generation.metodos.AgendaService;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de AgendaService
        AgendaService agendaService = new AgendaService();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        // Menú principal
        while (!salir) {
            // Mostrar el menú
            System.out.println("\n---- MENÚ DE OPCIONES ----");
            System.out.println("1. Añadir Contacto");
            System.out.println("2. Mostrar Contactos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de la entrada

                // Ejecutar la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Añadir Contacto");
                        agendaService.registrarContacto();  // Llamar al método para registrar contacto
                        break;

                    case 2:
                        System.out.println("Has seleccionado Mostrar Contactos");
                        break;

                    case 3:
                        System.out.println("¡Hasta luego!");
                        salir = true;  // Salir del programa
                        break;

                    default:
                        System.out.println("Opción no válida, por favor intenta de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Intenta de nuevo.");
                scanner.nextLine(); // Limpiar el buffer en caso de error
            }
        }

        scanner.close();  // Cerrar el scanner al finalizar
    } // main
} // class