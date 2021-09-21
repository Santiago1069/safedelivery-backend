package com.safedelivery.controladores;

import com.safedelivery.modelos.objetos.DatosActualizacionResidente;
import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.residente.ConsultarResidenteCasoDeUso;
import com.safedelivery.residente.EditarResidenteCasoDeUso;
import com.safedelivery.residente.EliminarResidenteCasoDeUso;
import com.safedelivery.residente.GuardarResidenteCasoDeUso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/residentes")
public class ControladorResidentes {

    public ConsultarResidenteCasoDeUso consultarResidenteCasoDeUso;
    public EditarResidenteCasoDeUso editarResidenteCasoDeUso;
    public EliminarResidenteCasoDeUso eliminarResidenteCasoDeUso;
    public GuardarResidenteCasoDeUso guardarResidenteCasoDeUso;

    public ControladorResidentes(ConsultarResidenteCasoDeUso consultarResidenteCasoDeUso, EditarResidenteCasoDeUso editarResidenteCasoDeUso,
                                 EliminarResidenteCasoDeUso eliminarResidenteCasoDeUso, GuardarResidenteCasoDeUso guardarResidenteCasoDeUso) {
        this.consultarResidenteCasoDeUso = consultarResidenteCasoDeUso;
        this.editarResidenteCasoDeUso = editarResidenteCasoDeUso;
        this.eliminarResidenteCasoDeUso = eliminarResidenteCasoDeUso;
        this.guardarResidenteCasoDeUso = guardarResidenteCasoDeUso;
    }

    @GetMapping
    public List<Residente> consutaResidentes(){
        return consultarResidenteCasoDeUso.consultar();
    }

    @GetMapping("/{documento}")
    public Residente consutaResidente(@PathVariable("documento") String documento){
        return consultarResidenteCasoDeUso.consultarPorDocumento(documento);
    }


    @PutMapping("/{id}")
    public Residente actualizar(@RequestBody DatosActualizacionResidente datosActualizacionResidente) {
        return this.editarResidenteCasoDeUso.editarResidente(datosActualizacionResidente);
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") int id) {
        this.eliminarResidenteCasoDeUso.eliminarResidente(id);
    }

    @PostMapping
    public void crearResidente(@RequestBody DatosGuardarResidente datosGuardarResidente){
        this.guardarResidenteCasoDeUso.guardarResidente(datosGuardarResidente);
    }

}
