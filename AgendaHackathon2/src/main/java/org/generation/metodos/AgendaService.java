package org.generation.metodos;

import org.generation.excepciones.AgendaLlena;
import org.generation.excepciones.AgendaLlenaException;
import org.generation.model.Contactos;

public class AgendaService {
    /** Indica si la agenda esta llena y muestra una Excepcion */
    public boolean agendaLlena() throws AgendaLlenaException {
        for (int i = 0; i < contactos.length; i++){
            if (contactos[i] == null);{


            }
        }

    public void espaciosLibres() {
        int espaciosLibres = tamanoMaximo - contactos.size();
        System.out.println("Quedan " + espaciosLibres + " espacios libres en la agenda.");
    }
    }
}
