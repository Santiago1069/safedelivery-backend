UPDATE RESIDENTE
    SET TIPO_DOCUMENTO = :idTipoDocumento,
    ID_NUMERO_APARTAMENTO = :apartamento,
    NUMERO_DOCUMENTO = :numeroDocumento,
    NOMBRE = :nombre,
    APELLIDO = :apellido,
    CELULAR = :celular,
    CORREO_ELECTRONICO = :correo
    WHERE ID_RESIDENTE = :id