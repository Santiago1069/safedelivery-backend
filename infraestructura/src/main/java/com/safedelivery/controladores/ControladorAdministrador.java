package com.safedelivery.controladores;

import com.safedelivery.administrador.CrearAdministradorCasoDeUso;
import com.safedelivery.modelos.objetos.DatosCrearAdministrador;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/administrador")
public class ControladorAdministrador {

    private CrearAdministradorCasoDeUso crearAdministradorCasoDeUso;

    public ControladorAdministrador(CrearAdministradorCasoDeUso crearAdministradorCasoDeUso) {
        this.crearAdministradorCasoDeUso = crearAdministradorCasoDeUso;
    }

    @PostMapping
    public void crear(@RequestBody DatosCrearAdministrador datosCrearAdministrador) {
        this.crearAdministradorCasoDeUso.crearAdministrador(datosCrearAdministrador);
    }

}
