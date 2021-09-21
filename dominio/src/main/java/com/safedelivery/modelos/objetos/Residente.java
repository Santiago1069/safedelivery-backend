package com.safedelivery.modelos.objetos;

public class Residente {

    int id;
    TipoDocumento tipoDocumento;
    String numeroDocumento;
    String nombre;
    String apellido;
    String celular;
    String correo;
    Apartamento apartamento;



    public Residente(int id, TipoDocumento tipoDocumento, String numeroDocumento, String nombre,
                     String apellido, String celular, String correo, Apartamento apartamento
                     ) {

        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.apartamento = apartamento;

    }

    public int getId() {
        return id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
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

    public Apartamento getApartamento() {
        return apartamento;
    }


}
