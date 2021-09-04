package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.repositorios.RepositorioResidentes;

import java.util.List;

public class ConsultarResidenteCasoDeUso {


    private RepositorioResidentes repositorioResidentes;

    public ConsultarResidenteCasoDeUso(RepositorioResidentes repositorioResidentes) {
        this.repositorioResidentes = repositorioResidentes;
    }

    public List<Residente> consultar(){
        return repositorioResidentes.consultar();

    }

}
