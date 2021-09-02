package com.safedelivery.modelos.objetos;

public class EmpleadoProveedor {

    int id;
    TipoDocumento tipoDocumento;
    String numeroDocumento;
    String nombre;
    Proveedor proveedor;


    public EmpleadoProveedor(int id, TipoDocumento tipoDocumento, String numeroDocumento, String nombre, Proveedor proveedor) {

        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.proveedor = proveedor;
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

    public Proveedor getProveedor() {
        return proveedor;
    }
}
