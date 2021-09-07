package com.safedelivery.repositorios.administrador;

import com.safedelivery.modelos.objetos.Administrador;
import com.safedelivery.utilidades.sqlfiles.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioAdministradorOracle {

    @SqlStatement(namespace = "administrador",
            value = "crearAdministrador")
    private String crearAdministrador;

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperAdministrador mapperAdministrador;

    public RepositorioAdministradorOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperAdministrador mapperAdministrador) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperAdministrador = mapperAdministrador;
    }


    public void crearAdministrador(Administrador administrador){

        MapSqlParameterSource parametros = new MapSqlParameterSource();

        parametros.addValue("idAdministrador", administrador.getIdAdministrador());
        parametros.addValue("correo", administrador.getCorreo());
        parametros.addValue("nombreCompleto", administrador.getNombreCompleto());
        parametros.addValue("contrasena", administrador.getContrasena());
        parametros.addValue("repetirContrasena", administrador.getRepetirContrasena());

        jdbcTemplate.update(crearAdministrador, parametros);


    }
}
