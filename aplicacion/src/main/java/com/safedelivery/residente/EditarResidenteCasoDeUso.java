package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.DatosActualizacionResidente;
import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.repositorios.RepositorioResidentes;

import javax.inject.Named;

public class EditarResidenteCasoDeUso {

    @Named
    private RepositorioResidentes repositorioResidentes;

    public EditarResidenteCasoDeUso (RepositorioResidentes repositorioResidentes){
        this.repositorioResidentes = repositorioResidentes;

    }

    public Residente editarResidente(DatosActualizacionResidente datosActualizacionResidente){
        repositorioResidentes.editarResidente(datosActualizacionResidente);
        return repositorioResidentes.consultarPorId(datosActualizacionResidente.getId());
    }
}
