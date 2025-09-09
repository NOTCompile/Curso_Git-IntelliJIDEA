package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //SIMULACION: Se comento la línea de codigo que no aporta al proyecto - se elimina
        //System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
