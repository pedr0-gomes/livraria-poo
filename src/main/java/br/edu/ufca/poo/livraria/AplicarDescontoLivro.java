package br.edu.ufca.poo.livraria;

public class AplicarDescontoLivro {
    public static void main(String[] args) {
        Autor autor = new Autor("Autor Teste", "000.000.000-00", "autor.teste@email.com");
        Livro livro = new Livro(autor);
        livro.setValor(159.9);

        System.out.println("Valor atual: " + livro.getValor());

        boolean descontoAplicado = livro.aplicaDescontoDe(0.1);

        System.out.println("Desconto aplicado? " + descontoAplicado);
        System.out.println("Valor com desconto: " + livro.getValor());
    }
}
