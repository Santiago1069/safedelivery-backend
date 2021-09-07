package com.safedelivery.administrador;

import com.safedelivery.modelos.objetos.Administrador;
import com.safedelivery.repositorios.RepositorioAdministrador;

import javax.inject.Named;

public class CrearAdministradorCasoDeUso {

    @Named
    private RepositorioAdministrador repositorioAdministrador;

    public CrearAdministradorCasoDeUso(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;

    }

    public void crearAdministrador(Administrador administrador){
        repositorioAdministrador.crearAdministrador(administrador);

    }


}
