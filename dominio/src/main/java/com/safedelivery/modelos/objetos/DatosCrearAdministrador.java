package com.safedelivery.modelos.objetos;

public class DatosCrearAdministrador {

    String correo;
    String nombreCompleto;
    String contrasena;
    String repetirContrasena;

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

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRepetirContrasena(String repetirContrasena) {
        this.repetirContrasena = repetirContrasena;
    }
}
