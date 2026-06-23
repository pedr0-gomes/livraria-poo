package br.edu.ufca.poo.livraria;

public interface Promocional {
    public boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.10);
    }
}
