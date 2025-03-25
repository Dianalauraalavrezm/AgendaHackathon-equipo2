package org.generation.metodos;

public class AgendaService {
    package org.generation.service;

import org.generation.model.Agenda;
import org.generation.model.Contactos;

    public class AgendaService {

        private Agenda agenda;

        public AgendaService(Agenda agenda) {
            this.agenda = agenda;
        }

        /** Listar todos los contactos **/
        public void listarContactos() {
            agenda.listarContactos();
        }

        /** Buscar un contacto por su nombre **/
        public void buscaContacto(String nombre) {
            agenda.buscaContacto(nombre);
        }
    }



}
