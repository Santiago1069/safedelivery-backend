package com.safedelivery.controladores;

import com.safedelivery.modelos.objetos.Proveedor;
import com.safedelivery.proveedores.ConsultaProveedoresCasoUso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador : sirve para configurar el enrutamiento y llama al caso de uso
 */

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/proveedores")
public class ControladorProveedores {

    private ConsultaProveedoresCasoUso consultaProveedoresCasoUso;

    public ControladorProveedores(ConsultaProveedoresCasoUso consultaProveedoresCasoUso) {
        this.consultaProveedoresCasoUso = consultaProveedoresCasoUso;
    }

    @GetMapping
    public List<Proveedor> consultarProveedores(){
        return consultaProveedoresCasoUso.consultar();
    }


}

