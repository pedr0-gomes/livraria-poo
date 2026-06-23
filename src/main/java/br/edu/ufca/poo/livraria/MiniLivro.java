package br.edu.ufca.poo.livraria;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    public MiniLivro(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn) {
        super(autor, nome, descricao, valor, numeroPaginas, isbn);
    }

    @Override
    void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo: MiniLivro (edição reduzida)");
    }

    @Override
    public String getResumo() {
        return "MiniLivro\n" + super.getResumo();
    }
}
