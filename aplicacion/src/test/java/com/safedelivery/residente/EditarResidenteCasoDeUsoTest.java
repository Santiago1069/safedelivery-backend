package com.safedelivery.residente;

import com.safedelivery.modelos.objetos.DatosActualizacionResidente;
import com.safedelivery.repositorios.RepositorioResidentes;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class EditarResidenteCasoDeUsoTest {

    private EditarResidenteCasoDeUso editarResidenteCasoDeUso;
    private RepositorioResidentes repositorioResidentes;

    @Before
    public void init(){
        repositorioResidentes = mock(RepositorioResidentes.class);
        editarResidenteCasoDeUso = new EditarResidenteCasoDeUso(repositorioResidentes);
    }

    @Test
    public void verificarActualizarResidente(){
        // arrange
        DatosActualizacionResidente datosActualizacionResidente = new DatosActualizacionResidente();
        datosActualizacionResidente.setId(100);
        datosActualizacionResidente.setNombre("Santiago");

        // act
        editarResidenteCasoDeUso.editarResidente(datosActualizacionResidente);

        // assert
        verify(repositorioResidentes, times(1)).editarResidente(datosActualizacionResidente);
        verify(repositorioResidentes, times(1)).consultarPorId(100);

    }

}
