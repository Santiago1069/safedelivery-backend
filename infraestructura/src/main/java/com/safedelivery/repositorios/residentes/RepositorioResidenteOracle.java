package com.safedelivery.repositorios.residentes;

import com.safedelivery.modelos.objetos.DatosActualizacionResidente;
import com.safedelivery.modelos.objetos.DatosGuardarResidente;
import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.modelos.objetos.TipoDocumento;
import com.safedelivery.repositorios.RepositorioResidentes;
import com.safedelivery.utilidades.sqlfiles.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioResidenteOracle implements RepositorioResidentes {

    @SqlStatement(namespace = "residentes",
       value = "editarResidente")
    private String editarResidente;

    @SqlStatement (namespace = "residentes",
        value = "eliminarResidente")
    private String eliminarResidente;

    @SqlStatement (namespace = "residentes",
        value = "consultarResidentePorId")
    private String consultarResidentePorId;

    @SqlStatement(namespace = "residentes",
        value = "guardarResidente")
    private String guardarResidentes;

    @SqlStatement(namespace = "residentes",
        value = "consultarResidente")
    private String consultarResidentes;

    @SqlStatement(namespace = "residentes",
            value = "consultarResidentePorDocumento")
    private String consultarResidentePorDocumento;



    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperResidente mapperResidente;

    public RepositorioResidenteOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperResidente mapperResidente) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperResidente = mapperResidente;
    }

    @Override
    public List<Residente> consultar(){

        return jdbcTemplate.query(consultarResidentes, mapperResidente);

    }

    @Override
    public Residente consultarPorId(int id) {

        MapSqlParameterSource parametros = new MapSqlParameterSource();
        parametros.addValue("id", id);
        return jdbcTemplate.queryForObject(consultarResidentePorId, parametros, mapperResidente);
    }

    @Override
    public void editarResidente(DatosActualizacionResidente datosActualizacionResidente) {

        MapSqlParameterSource parametros = new MapSqlParameterSource();

        TipoDocumento tipoDocumento = TipoDocumento.buscarPorNombre(datosActualizacionResidente.getTipoDocumentoNombre());
        parametros.addValue("idTipoDocumento", tipoDocumento.getId());
        parametros.addValue("apartamento", datosActualizacionResidente.getNumeroApartamento());
        parametros.addValue("numeroDocumento", datosActualizacionResidente.getNumeroDocumento());
        parametros.addValue("nombre", datosActualizacionResidente.getNombre());
        parametros.addValue("apellido", datosActualizacionResidente.getApellido());
        parametros.addValue("celular", datosActualizacionResidente.getCelular());
        parametros.addValue("correo", datosActualizacionResidente.getCorreo());
        parametros.addValue("id", datosActualizacionResidente.getId());

        jdbcTemplate.update(editarResidente, parametros);
    }

    @Override
    public void eliminarResidente(int idResidente){

        MapSqlParameterSource parametros = new MapSqlParameterSource();
        parametros.addValue("id", idResidente);

        jdbcTemplate.update(eliminarResidente, parametros);

    }

    @Override
    public void guardarResidente(DatosGuardarResidente datosGuardarResidente) {

        MapSqlParameterSource parametros = new MapSqlParameterSource();

        parametros.addValue("idTipoDocumento", datosGuardarResidente.getIdTipoDocumento());
        parametros.addValue("numeroDocumento", datosGuardarResidente.getNumeroDocumento());
        parametros.addValue("nombre", datosGuardarResidente.getNombre());
        parametros.addValue("apellido", datosGuardarResidente.getApellido());
        parametros.addValue("celular", datosGuardarResidente.getCelular());
        parametros.addValue("correo", datosGuardarResidente.getCorreo());
        parametros.addValue("idNumeroApartamento", datosGuardarResidente.getIdNumeroApartamento());

        jdbcTemplate.update(guardarResidentes, parametros);

    }

    @Override
    public Residente consultarPorDocumento(String documento) {
        MapSqlParameterSource parametros = new MapSqlParameterSource();
        parametros.addValue("documento", documento);
        return jdbcTemplate.queryForObject(consultarResidentePorDocumento, parametros, mapperResidente);
    }


}
