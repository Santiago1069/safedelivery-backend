package com.safedelivery.repositorios;

import com.safedelivery.modelos.objetos.DatosActualizacionResidente;
import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.modelos.objetos.Residente;

import java.util.List;

public interface RepositorioResidentes {


    List<Residente> consultar();

    Residente consultarPorId(int id);

    void editarResidente(DatosActualizacionResidente datosActualizacionResidente);

    void eliminarResidente(int idResidente);

    void guardarResidente(DatosGuardarResidente datosGuardarResidente);
}
