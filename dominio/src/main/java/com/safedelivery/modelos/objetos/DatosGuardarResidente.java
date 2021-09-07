package com.safedelivery.modelos.objetos;

public class DatosGuardarResidente {

    int idResidente;
    int idTipoDocumento;
    String numeroDocumento;
    String nombre;
    String apellido;
    int celular;
    String correo;
    int idNumeroApartamento;

    public int getIdResidente() {
        return idResidente;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIdNumeroApartamento() {
        return idNumeroApartamento;
    }
}
