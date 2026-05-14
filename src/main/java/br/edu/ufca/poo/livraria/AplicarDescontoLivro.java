package br.edu.ufca.poo.livraria;

public class AplicarDescontoLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.valor = 159.90;

        System.out.println("Valor atual: " + livro.valor);

        livro.aplicaDescontoDe(0.1);

        System.out.println("Valor com desconto: " + livro.valor);
    }
}
