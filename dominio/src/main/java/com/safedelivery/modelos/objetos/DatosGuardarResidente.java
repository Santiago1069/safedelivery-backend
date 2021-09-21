package com.safedelivery.modelos.objetos;

public class DatosGuardarResidente {

    int idResidente;
    int idTipoDocumento;
    String numeroDocumento;
    String nombre;
    String apellido;
    String celular;
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

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIdNumeroApartamento() {
        return idNumeroApartamento;
    }

    public void setIdResidente(int idResidente) {
        this.idResidente = idResidente;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdNumeroApartamento(int idNumeroApartamento) {
        this.idNumeroApartamento = idNumeroApartamento;
    }
}
