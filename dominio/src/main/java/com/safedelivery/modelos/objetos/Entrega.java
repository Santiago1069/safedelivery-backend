package com.safedelivery.modelos.objetos;

import java.util.Date;

public class Entrega {

    int id;
    EmpleadoProveedor empleadoProveedor;
    Residente residente;
    TipoPaquete tipoPaquete;
    Date fecha;


    public Entrega(int id, EmpleadoProveedor empleadoProveedor, Residente residente,
                   TipoPaquete tipoPaquete, Date fecha) {

        this.id = id;
        this.empleadoProveedor = empleadoProveedor;
        this.residente = residente;
        this.tipoPaquete = tipoPaquete;
        this.fecha = fecha;
    }


    public int getId() {
        return id;
    }

    public EmpleadoProveedor getEmpleadoProveedor() {
        return empleadoProveedor;
    }

    public Residente getResidente() {
        return residente;
    }

    public TipoPaquete getTipoPaquete() {
        return tipoPaquete;
    }

    public Date getFecha() {
        return fecha;
    }

}
