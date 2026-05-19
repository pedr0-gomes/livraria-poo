package br.edu.ufca.poo.livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor("Autor Teste", "000.000.000-00", "autor.teste@email.com");
        Livro livro = new Livro(autor);
        livro.setValor(100.0);

        boolean descontoDe30Aplicado = livro.aplicaDescontoDe(0.3);

        System.out.println("Desconto de 30% aplicado? " + descontoDe30Aplicado);
        System.out.println("Valor depois do desconto de 30%: " + livro.getValor());

        boolean descontoDe40Aplicado = livro.aplicaDescontoDe(0.4);

        System.out.println("Desconto de 40% aplicado? " + descontoDe40Aplicado);
        System.out.println("Valor depois da tentativa de desconto de 40%: " + livro.getValor());
    }
}
