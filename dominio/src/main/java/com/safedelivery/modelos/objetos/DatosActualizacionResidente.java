package com.safedelivery.modelos.objetos;

public class DatosActualizacionResidente {

    int id;
    int numeroApartamento;
    String numeroDocumento;
    String nombre;
    String apellido;
    String celular;
    String correo;
    String idTipoDocumento;

    public int getId() {
        return id;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
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

    public String getTipoDocumentoNombre() {
        return idTipoDocumento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
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

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
}
