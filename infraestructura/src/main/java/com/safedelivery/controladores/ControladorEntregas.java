package com.safedelivery.controladores;

import com.safedelivery.entregas.ConsultarEntregaCasoUso;
import com.safedelivery.modelos.objetos.Entrega;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/entregas")
public class ControladorEntregas {

    private ConsultarEntregaCasoUso consultarEntregaCasoUso;

    public ControladorEntregas(ConsultarEntregaCasoUso consultarEntregaCasoUso) {
        this.consultarEntregaCasoUso = consultarEntregaCasoUso;
    }

    @GetMapping
    public List<Entrega> consultarEntregas(){
        return consultarEntregaCasoUso.consultar();
    }
}
