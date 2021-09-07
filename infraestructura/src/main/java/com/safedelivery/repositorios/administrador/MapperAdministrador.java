package com.safedelivery.repositorios.administrador;

import com.safedelivery.modelos.objetos.Administrador;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class MapperAdministrador implements RowMapper<Administrador> {

    @Override
    public Administrador mapRow(ResultSet rs, int rowNum) throws SQLException {

        int id = rs.getInt("ID_REGISTRO");
        String email = rs.getString("EMAIL");
        String nombreCompleto = rs.getString("NOMBRE_COMPLETO");
        String contrasena = rs.getString("CONTRASENA");
        String repetirContrasena = rs.getString("REPETIR_CONTRASENA");

        return new Administrador(id, email, nombreCompleto, contrasena, repetirContrasena);
    }

}
