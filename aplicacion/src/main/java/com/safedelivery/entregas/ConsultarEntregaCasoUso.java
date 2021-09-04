package com.safedelivery.entregas;

import com.safedelivery.modelos.objetos.Entrega;

import java.util.List;

public class ConsultarEntregaCasoUso {

    private ConsultarEntregaCasoUso consultarEntregaCasoUso;

    public ConsultarEntregaCasoUso(ConsultarEntregaCasoUso consultarEntregaCasoUso) {
        this.consultarEntregaCasoUso = consultarEntregaCasoUso;
    }

    public List<Entrega> consultar(){
        return consultarEntregaCasoUso.consultar();

    }

}
