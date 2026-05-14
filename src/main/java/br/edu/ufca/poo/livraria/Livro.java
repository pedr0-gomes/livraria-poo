package br.edu.ufca.poo.livraria;

public class Livro {
    public String nome;
    String descricao;
    double valor;
    int numeroPaginas;
    String isbn;
    Autor autor;

    public Livro() {
        System.out.println("Livro criado com sucesso!");
    }

    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);

        if (temAutor()) {
            autor.mostrarDetalhes();
        }
    }

    boolean temAutor() {
        return autor != null;
    }

    void aplicaDescontoDe(double porcentagem) {
        valor -= valor * porcentagem;
    }
}
