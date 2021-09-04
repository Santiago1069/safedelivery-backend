package com.safedelivery.repositorios.residentes;

import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.repositorios.RepositorioResidentes;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class RepositorioResidenteOracle implements RepositorioResidentes {

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperResidente mapperResidente;

    public RepositorioResidenteOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperResidente mapperResidente) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperResidente = mapperResidente;
    }

    @Override
    public List<Residente> consultar(){
        String sql = "SELECT * FROM RESIDENTE \n" +
                "    INNER JOIN APARTAMENTO ON RESIDENTE.ID_NUMERO_APARTAMENTO = APARTAMENTO.NUMERO_APARTAMENTO\n" +
                "    INNER JOIN TIPO_DOCUMENTO ON RESIDENTE.TIPO_DOCUMENTO = TIPO_DOCUMENTO.ID_TIPO_DOCUMENTO\n";

        return jdbcTemplate.query(sql, mapperResidente);

    }



}
