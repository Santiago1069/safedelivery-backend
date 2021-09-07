package com.safedelivery.modelos.objetos;

//* la tabla en base de datos se llama Registro
public class Administrador {

    int idAdministrador;
    String correo;
    String nombreCompleto;
    String contrasena;
    String repetirContrasena;


    public Administrador(int id, String correo, String nombreCompleto, String contrasena, String repetirContrasena) {
        this.idAdministrador = id;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
    }

    public int getIdAdministrador() {
        return idAdministrador;
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
