package com.safedelivery.modelos.objetos;

public class Proveedor {

    int id;
    String nombre;
    String imagen;

    public Proveedor(int id, String nombre, String imagen) {

        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }
}
