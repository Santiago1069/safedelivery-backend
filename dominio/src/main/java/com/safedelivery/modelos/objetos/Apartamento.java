package com.safedelivery.modelos.objetos;

public class Apartamento {

    int numeroApartamento;
    int numeroTorre;

    public Apartamento(int numeroApartamento, int numeroTorre) {
        this.numeroApartamento = numeroApartamento;
        this.numeroTorre = numeroTorre;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public int getNumeroTorre() {
        return numeroTorre;
    }
}
