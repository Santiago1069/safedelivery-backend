package com.safedelivery.repositorios.residentes;

import com.safedelivery.modelos.objetos.Apartamento;
import com.safedelivery.modelos.objetos.Residente;
import com.safedelivery.modelos.objetos.TipoDocumento;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class MapperResidente implements RowMapper<Residente> {

    @Override
    public  Residente mapRow(ResultSet rs, int rowNum) throws SQLException {

        int id = rs.getInt("ID_RESIDENTE");
        TipoDocumento tipoDocumento = TipoDocumento.obtenerPorId(rs.getInt("ID_TIPO_DOCUMENTO"));
        String numeroDocumento = rs.getString("NUMERO_DOCUMENTO");
        String nombre = rs.getString("NOMBRE");
        String apellido = rs.getString("APELLIDO");
        int celular = rs.getInt("CELULAR");
        String correo = rs.getString("CORREO_ELECTRONICO");

        int numeroApartamento = rs.getInt("NUMERO_APARTAMENTO");
        int numeroTorre = rs.getInt("NUMERO_TORRE");

        Apartamento apartamento = new Apartamento(numeroApartamento, numeroTorre);
                rs.getObject("ID_NUMERO_APARTAMENTO");

        return new Residente(id, tipoDocumento, numeroDocumento, nombre, apellido, celular, correo, apartamento);

    }



}
