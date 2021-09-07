package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.repositorios.RepositorioResidentes;

import javax.inject.Named;

@Named
public class EliminarResidenteCasoDeUso {

    private RepositorioResidentes repositorioResidentes;

    public EliminarResidenteCasoDeUso (RepositorioResidentes repositorioResidentes){
        this.repositorioResidentes = repositorioResidentes;

    }

    public void eliminarResidente(int idResidente){
        repositorioResidentes.eliminarResidente(idResidente);
    }
}
