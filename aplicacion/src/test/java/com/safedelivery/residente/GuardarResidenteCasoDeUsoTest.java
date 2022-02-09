package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.repositorios.RepositorioResidentes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GuardarResidenteCasoDeUsoTest {

    private GuardarResidenteCasoDeUso guardarResidenteCasoDeUso;
    private RepositorioResidentes repositorioResidentes;


    @Before
    public void init(){
        repositorioResidentes = mock(RepositorioResidentes.class);
        guardarResidenteCasoDeUso = new GuardarResidenteCasoDeUso(repositorioResidentes);
    }

    @Test
    public void verificarGuardarResidente(){
        // arrange
        DatosGuardarResidente datosGuardarResidente = new DatosGuardarResidente();
        // act
        guardarResidenteCasoDeUso.guardarResidente(datosGuardarResidente);
        // assert
        verify(repositorioResidentes, times(1)).guardarResidente(datosGuardarResidente);
    }



}
