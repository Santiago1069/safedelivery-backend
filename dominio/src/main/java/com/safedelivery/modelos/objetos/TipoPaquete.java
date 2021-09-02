package com.safedelivery.modelos.objetos;

public class TipoPaquete {

    int id;
    String nombre;

    public TipoPaquete(int id, String nombre) {

        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
