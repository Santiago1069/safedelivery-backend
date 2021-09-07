package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.repositorios.RepositorioResidentes;

import javax.inject.Named;

public class GuardarResidenteCasoDeUso {

    @Named
    private RepositorioResidentes repositorioResidentes;

    public GuardarResidenteCasoDeUso (RepositorioResidentes repositorioResidentes){
        this.repositorioResidentes = repositorioResidentes;

    }

    public void guardarResidente(DatosGuardarResidente datosGuardarResidente){
        repositorioResidentes.guardarResidente(datosGuardarResidente);

    }



}
