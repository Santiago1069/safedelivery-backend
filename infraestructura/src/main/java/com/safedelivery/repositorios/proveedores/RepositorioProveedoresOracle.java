package com.safedelivery.repositorios.proveedores;

import com.safedelivery.modelos.objetos.Proveedor;
import com.safedelivery.repositorios.RepositorioProveedores;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio: sirve para ejecutar los comandos sql usando la conexión configurada
 */
@Repository
public class RepositorioProveedoresOracle implements RepositorioProveedores {

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperProveedor mapperProveedor;

    public RepositorioProveedoresOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperProveedor mapperProveedor) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperProveedor = mapperProveedor;
    }

    @Override
    public List<Proveedor> consultar() {
        return jdbcTemplate.query("SELECT * FROM PROVEEDOR", mapperProveedor);
    }



}
