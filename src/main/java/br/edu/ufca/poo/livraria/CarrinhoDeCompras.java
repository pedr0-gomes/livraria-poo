package br.edu.ufca.poo.livraria;

public class CarrinhoDeCompras {
    private double total;

    public CarrinhoDeCompras() {

    }
    
    public void adiciona(Produto produto) {
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }


}
