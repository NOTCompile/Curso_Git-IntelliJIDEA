package com.acme;

public class Hola_Mundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        msg.saludar(nombre);
    }

}
