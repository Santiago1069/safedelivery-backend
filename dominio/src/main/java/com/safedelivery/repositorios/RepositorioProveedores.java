package com.safedelivery.repositorios;


import com.safedelivery.modelos.objetos.DatosGuardarEmpleadorProveedor;
import com.safedelivery.modelos.objetos.EmpleadoProveedor;
import com.safedelivery.modelos.objetos.Proveedor;

import java.util.List;

public interface RepositorioProveedores {

    List<Proveedor> consultarProveedor();

    void guardarEmpleadoProveedor(DatosGuardarEmpleadorProveedor datosGuardarEmpleadorProveedor);

}
