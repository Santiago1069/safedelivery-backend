package com.safedelivery.repositorios.entregas;

import com.safedelivery.modelos.objetos.Entrega;
import com.safedelivery.repositorios.RepositorioEntregas;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class RepositorioEntregasOracle implements RepositorioEntregas {

    private NamedParameterJdbcTemplate jdbcTemplate;
    private MapperEntregas mapperEntregas;

    public RepositorioEntregasOracle(NamedParameterJdbcTemplate jdbcTemplate, MapperEntregas mapperEntregas) {
        this.jdbcTemplate = jdbcTemplate;
        this.mapperEntregas = mapperEntregas;
    }

    @Override
    public List<Entrega> consultar(){

        String sql = "SELECT * FROM ENTREGA " +
                "   INNER JOIN EMPLEADO_PROVEEDOR ON ENTREGA.ID_EMPLEADO_PROVEEDOR = EMPLEADO_PROVEEDOR.ID_EMPLEADO_PROVEEDOR" +
                "   INNER JOIN RESIDENTE ON ENTREGA.ID_RESIDENTE = RESIDENTE.ID_RESIDENTE" +
                "   INNER JOIN TIPO_PAQUETE ON ENTREGA.ID_TIPO_PAQUETE = TIPO_PAQUETE.ID_TIPO_PAQUETE";

        return jdbcTemplate.query(sql, mapperEntregas);

    }



}
