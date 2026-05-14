package br.edu.ufca.poo.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "O Pequeno Principe";
        livro.descricao = "Recursos de linguagem";
        livro.valor = 159.90;
        livro.isbn = "123-45-6789-10-1";
        livro.numeroPaginas = 100;
    }
}
