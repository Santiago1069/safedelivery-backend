package com.safedelivery.administrador;

import com.safedelivery.modelos.objetos.Administrador;
import com.safedelivery.modelos.objetos.DatosCrearAdministrador;
import com.safedelivery.repositorios.RepositorioAdministrador;

import javax.inject.Named;

@Named
public class CrearAdministradorCasoDeUso {

    private RepositorioAdministrador repositorioAdministrador;

    public CrearAdministradorCasoDeUso(RepositorioAdministrador repositorioAdministrador) {
        this.repositorioAdministrador = repositorioAdministrador;

    }

    public void crearAdministrador(DatosCrearAdministrador datosCrearAdministrador){
        repositorioAdministrador.crearAdministrador(datosCrearAdministrador);

    }


}
