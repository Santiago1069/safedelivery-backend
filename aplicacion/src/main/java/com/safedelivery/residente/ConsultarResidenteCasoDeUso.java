package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.repositorios.RepositorioResidentes;


import javax.inject.Named;
import java.util.List;

@Named
public class ConsultarResidenteCasoDeUso {


    private RepositorioResidentes repositorioResidentes;

    public ConsultarResidenteCasoDeUso(RepositorioResidentes repositorioResidentes) {
        this.repositorioResidentes = repositorioResidentes;
    }

    public List<Residente> consultar(){
        return repositorioResidentes.consultar();
    }

    public  Residente consultarPorDocumento(String documento) {
      return this.repositorioResidentes.consultarPorDocumento(documento);
    }

}
