package com.safedelivery.modelos.objetos;

public enum TipoDocumento {

    CEDULACIUDADANIA(1),
    PASAPORTE(2),
    CEDULAEXTRANJERIA(3),
    TARJETAIDENTIDAD(4),
    TARJETAEXTRANJERIA(5),
    NIT(6);

    private int id;

    TipoDocumento(int id) {
        this.id = id;
    }

    public static TipoDocumento obtenerPorId(int id) {

        for (TipoDocumento t : values()) {
            if(t.id == id){
                return t;
            }
        }

        return null;
    }

    public static TipoDocumento buscarPorNombre(String nombre) {
        for (TipoDocumento t : values()) {
            if(t.name().equals(nombre)){
                return t;
            }
        }

        return null;
    }

    public int getId() {
        return id;
    }
}
