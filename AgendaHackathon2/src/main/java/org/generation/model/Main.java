package org.generation;

import org.generation.model.Agenda;
import org.generation.model.Contactos;
import org.generation.service.AgendaService;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Agenda agenda = new Agenda(new ArrayList<>());
            AgendaService agendaService = new AgendaService(agenda);

            // Agregamos algunos contactos de prueba
            agenda.añadirContacto(new Contactos(1, "Diana", "Pérez", "12345678"));
            agenda.añadirContacto(new Contactos(2, "Juan", "López", "98765432"));

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n📒 MENU AGENDA");
                System.out.println("1️⃣ Listar contactos");
                System.out.println("2️⃣ Buscar contacto por nombre");
                System.out.println("0️⃣ Salir");
                System.out.print("👉 Elige una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        agendaService.listarContactos();
                        break;
                    case 2:
                        System.out.print("🔍 Ingresa el nombre del contacto: ");
                        String nombre = scanner.nextLine();
                        agendaService.buscaContacto(nombre);
                        break;
                    case 0:
                        System.out.println("👋 Saliendo...");
                        break;
                    default:
                        System.out.println("⚠️ Opción inválida.");
                }
            } while (opcion != 0);

            scanner.close();
        }
    }

}
