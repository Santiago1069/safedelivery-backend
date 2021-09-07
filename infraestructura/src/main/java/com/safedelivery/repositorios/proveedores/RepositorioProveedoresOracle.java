package com.safedelivery.repositorios.proveedores;

import com.safedelivery.modelos.objetos.DatosGuardarEmpleadorProveedor;
import com.safedelivery.modelos.objetos.Proveedor;
import com.safedelivery.repositorios.RepositorioProveedores;
import com.safedelivery.utilidades.sqlfiles.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio: sirve para ejecutar los comandos sql usando la conexión configurada
 */
@Repository
public class RepositorioProveedoresOracle implements RepositorioProveedores {

    @SqlStatement(namespace = "proveedores",
            value = "guardarEmpleadoProveedor")
    private String guardarEmpleadoProveedor;

    @SqlStatement(namespace = "proveedores",
            value = "consultarProveedor")
    private String consultarProveedor;

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperProveedor mapperProveedor;

    public RepositorioProveedoresOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperProveedor mapperProveedor) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperProveedor = mapperProveedor;
    }

    @Override
    public List<Proveedor> consultarProveedor() {
        return jdbcTemplate.query(consultarProveedor, mapperProveedor);
    }


    @Override
    public void guardarEmpleadoProveedor(DatosGuardarEmpleadorProveedor datosGuardarEmpleadorProveedor) {

        MapSqlParameterSource parametros = new MapSqlParameterSource();

        parametros.addValue("idEmpleadoProveedor", datosGuardarEmpleadorProveedor.getIdEmpleadoProveedor());
        parametros.addValue("idTipoDocumento", datosGuardarEmpleadorProveedor.getIdTipoDocumento());
        parametros.addValue("numeroDocumento", datosGuardarEmpleadorProveedor.getNumeroDocumento());
        parametros.addValue("nombre", datosGuardarEmpleadorProveedor.getNombre());
        parametros.addValue("idProveedor", datosGuardarEmpleadorProveedor.getIdProveedor());

        jdbcTemplate.update(guardarEmpleadoProveedor, parametros);


    }


}
