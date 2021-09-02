package com.safedelivery.modelos.objetos;

public class Registro {

    int id;
    String correo;
    String nombreCompleto;
    String contrasena;
    String repetirContrasena;


    public Registro(int id, String correo, String nombreCompleto, String contrasena, String repetirContrasena) {
        this.id = id;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRepetirContrasena() {
        return repetirContrasena;
    }

}
