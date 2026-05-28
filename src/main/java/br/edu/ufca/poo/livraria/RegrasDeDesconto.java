package br.edu.ufca.poo.livraria;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor("Autor Teste", "000.000.000-00", "autor.teste@email.com");

        Livro livro = new Livro(autor);
        livro.setNome("Livro Fisico de Teste");
        livro.setValor(100.0);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Ebook de Teste");
        ebook.setValor(100.0);
        ebook.setFormato("PDF");
        ebook.setTamanhoEmMb(5.2);

        boolean descontoLivroAplicado = livro.aplicaDescontoDe(0.3);
        boolean descontoLivroBloqueado = livro.aplicaDescontoDe(0.4);

        boolean descontoEbookAplicado = ebook.aplicaDescontoDe(0.15);
        boolean descontoEbookBloqueado = ebook.aplicaDescontoDe(0.2);

        System.out.println("Desconto de 30% no livro aplicado? " + descontoLivroAplicado);
        System.out.println("Desconto de 40% no livro aplicado? " + descontoLivroBloqueado);
        System.out.println("Valor final do livro: " + livro.getValor());

        System.out.println("Desconto de 15% no ebook aplicado? " + descontoEbookAplicado);
        System.out.println("Desconto de 20% no ebook aplicado? " + descontoEbookBloqueado);
        System.out.println("Valor final do ebook: " + ebook.getValor());
    }
}
