package com.safedelivery.proveedores;

import com.safedelivery.modelos.objetos.Proveedor;
import com.safedelivery.repositorios.RepositorioProveedores;

import javax.inject.Named;
import java.util.List;

/**
 * Caso de uso: Es el responsable de la programación de la funcionalidad (feature)
 */
@Named
public class ConsultaProveedoresCasoUso {

    private RepositorioProveedores repositorioProveedores;

    public ConsultaProveedoresCasoUso(RepositorioProveedores repositorioProveedores) {
        this.repositorioProveedores = repositorioProveedores;
    }

    public List<Proveedor> consultar(){
       return repositorioProveedores.consultar();
    }


}
