package com.safedelivery.repositorios.administrador;

import com.safedelivery.modelos.objetos.Administrador;
import com.safedelivery.modelos.objetos.DatosCrearAdministrador;
import com.safedelivery.repositorios.RepositorioAdministrador;
import com.safedelivery.utilidades.sqlfiles.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioAdministradorOracle implements RepositorioAdministrador {

    @SqlStatement(namespace = "administrador",
            value = "crearAdministrador")
    private String crearAdministrador;

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperAdministrador mapperAdministrador;

    public RepositorioAdministradorOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperAdministrador mapperAdministrador) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperAdministrador = mapperAdministrador;
    }


    public void crearAdministrador(DatosCrearAdministrador datosCrearAdministrador){

        MapSqlParameterSource parametros = new MapSqlParameterSource();

        parametros.addValue("correo", datosCrearAdministrador.getCorreo());
        parametros.addValue("nombreCompleto", datosCrearAdministrador.getNombreCompleto());
        parametros.addValue("contrasena", datosCrearAdministrador.getContrasena());
        parametros.addValue("repetirContrasena", datosCrearAdministrador.getRepetirContrasena());

        jdbcTemplate.update(crearAdministrador, parametros);


    }
}
