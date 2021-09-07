package com.safedelivery.repositorios.entregas;

import com.safedelivery.modelos.objetos.Entrega;
import com.safedelivery.repositorios.RepositorioEntregas;
import com.safedelivery.utilidades.sqlfiles.SqlStatement;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class RepositorioEntregasOracle implements RepositorioEntregas {

    @SqlStatement(namespace = "entregas",
            value = "consultarEntregas")
    private String consultarEntregas;

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperEntregas mapperEntregas;

    public RepositorioEntregasOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperEntregas mapperEntregas) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperEntregas = mapperEntregas;
    }

    @Override
    public List<Entrega> consultar(){

        return jdbcTemplate.query(consultarEntregas, mapperEntregas);

    }



}
