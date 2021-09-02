package com.safedelivery.repositorios.proveedores;

import com.safedelivery.modelos.objetos.Proveedor;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;


@Named
public class MapperProveedor implements RowMapper<Proveedor> {

    @Override
    public Proveedor mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("ID_PROVEEDOR");
        String nombre = rs.getString("NOMBRE");

        return new Proveedor(id, nombre);
    }
}
