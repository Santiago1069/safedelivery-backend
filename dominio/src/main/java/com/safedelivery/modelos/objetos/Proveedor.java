package com.safedelivery.modelos.objetos;

public class Proveedor {

    int id;
    String nombre;

    public Proveedor(int id, String nombre) {

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
