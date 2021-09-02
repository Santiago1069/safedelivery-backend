package com.safedelivery.modelos.objetos;

import java.util.Date;

public class ReclamarPaquete {

    int id;
    Entrega entrega;
    Date fecha;

    public ReclamarPaquete(int id, Entrega entrega, Date fecha) {

        this.id = id;
        this.entrega = entrega;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public Date getFecha() {
        return fecha;
    }
}
