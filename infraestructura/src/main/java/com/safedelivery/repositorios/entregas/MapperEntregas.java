package com.safedelivery.repositorios.entregas;

import com.safedelivery.modelos.objetos.*;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class MapperEntregas implements RowMapper<Entrega> {

    @Override
    public Entrega mapRow(ResultSet rs, int rowNum) throws SQLException {

        int idEntrega = rs.getInt("ID_ENTREGA");

        // --------------------------------------------------------------------------------

        int idProveedorentidad = rs.getInt("ID_PROVEEDOR");
        String nombreProveedor = rs.getString("NOMBRE");

        Proveedor idProveedorCreado = new Proveedor (idProveedorentidad, nombreProveedor);
                rs.getObject("IDPROVEEDOR");

        // --------------------------------------------------------------------------------
        int idEmpleadoProveedor = rs.getInt("ID_EMPLEADO_PROVEEDOR");
        String numeroDocumentoEmpleadoProveedor = rs.getString("NUMERO_DOCUMENTO");
        String nombreEmpleadoProveedor = rs.getString("NOMBRE");
        int idTipoDocumentoEmpleadoProveedor = rs.getInt("ID_TIPO_DOCUMENTO");

        EmpleadoProveedor empleadoProveedor = new EmpleadoProveedor(idEmpleadoProveedor, TipoDocumento.obtenerPorId(idTipoDocumentoEmpleadoProveedor), numeroDocumentoEmpleadoProveedor, nombreEmpleadoProveedor, idProveedorCreado);

        // ----------------------------------------------------------------------------------------

        int numeroApartamento = rs.getInt("NUMERO_APARTAMENTO");
        int numeroTorre = rs.getInt("NUMERO_TORRE");

        Apartamento idapartamentoResidente = new Apartamento(numeroApartamento, numeroTorre);
        rs.getObject("ID_NUMERO_APARTAMENTO");

        // ----------------------------------------------------------------------------------------

        int idResidente = rs.getInt("ID_RESIDENTE");
        int idTipoDocumentoResidente = rs.getInt("TIPO_DOCUMENTO");
        String numeroDocumentoResidente = rs.getString("NUMERO_DOCUMENTO");
        String nombreResidente = rs.getString("NOMBRE");
        String apellidoResidente = rs.getString("APELLIDO");
        int celularResidente = rs.getInt("CELULAR");
        String correoResidente = rs.getString("CORREO_ELECTRONICO");

        Residente residente = new Residente(idResidente, TipoDocumento.obtenerPorId(idTipoDocumentoResidente), numeroDocumentoResidente, nombreResidente, apellidoResidente, celularResidente, correoResidente, idapartamentoResidente);

        // ------------------------------------------------------------------------------------------

        int idTipoPaquete = rs.getInt("ID_TIPO_PAQUETE");
        String nombrePaquete = rs.getString("NOMBRE");

        TipoPaquete tipoPaquete = new TipoPaquete(idTipoPaquete, nombrePaquete);

        // --------------------------------------------------------------------------------

        Date fecha = rs.getDate("FECHA");

        return new Entrega(idEntrega, empleadoProveedor, residente, tipoPaquete, fecha);

    }
}