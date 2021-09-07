package com.safedelivery.proveedores;

import com.safedelivery.modelos.objetos.DatosGuardarEmpleadorProveedor;
import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.modelos.objetos.EmpleadoProveedor;
import com.safedelivery.repositorios.RepositorioProveedores;

import javax.inject.Named;

public class GuardarEmpleadoProveedorCasoDeUso {

    @Named
    private RepositorioProveedores repositorioProveedores;

    public GuardarEmpleadoProveedorCasoDeUso (RepositorioProveedores repositorioProveedores){
        this.repositorioProveedores = repositorioProveedores;

    }

    public void guardarEmpleadoProveedor(DatosGuardarEmpleadorProveedor datosGuardarEmpleadorProveedor){
        repositorioProveedores.guardarEmpleadoProveedor(datosGuardarEmpleadorProveedor);
    }
}
