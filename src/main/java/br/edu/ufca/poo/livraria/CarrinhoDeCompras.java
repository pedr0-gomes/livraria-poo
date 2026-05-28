package br.edu.ufca.poo.livraria;

public class CarrinhoDeCompras {
    private double total;

    public CarrinhoDeCompras() {

    }
    
    public void adiciona(Livro livro) {
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }


}
