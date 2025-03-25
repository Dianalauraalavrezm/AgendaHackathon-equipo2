package org.generation.model;

import java.util.ArrayList;

// Almacena información de contactos
public class Agenda {

    private ArrayList<Contactos> contactos;
    private static final int LimiteContacto = 10;

    public Agenda(ArrayList<Contactos> contactos) {
        this.contactos = contactos;
    }
}// class Agenda
