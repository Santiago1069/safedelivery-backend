package com.safedelivery.controladores;

import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.residente.ConsultarResidenteCasoDeUso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/residentes")
public class ControladorResidentes {

    public ConsultarResidenteCasoDeUso consultarResidenteCasoDeUso;

    public ControladorResidentes(ConsultarResidenteCasoDeUso consultarResidenteCasoDeUso) {
        this.consultarResidenteCasoDeUso = consultarResidenteCasoDeUso;
    }

    @GetMapping
    public List<Residente> consutaResidentes(){
        return consultarResidenteCasoDeUso.consultar();
    }
}
