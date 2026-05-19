package br.edu.ufca.poo.livraria;

public class ComparandoReferencias {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Pedro Gomes", "123.321.456-78", "gomes.pedro@aluno.ufca.edu.br");
        Autor autor2 = new Autor("Pedro Gomes", "123.321.456-78", "gomes.pedro@aluno.ufca.edu.br");

        if (autor1 == autor2) {
            System.out.println("autor1 e autor2 apontam para o mesmo objeto.");
        } else {
            System.out.println("autor1 e autor2 são objetos diferentes.");
        }

        Livro livro = new Livro(autor1);

        if (autor1 == livro.getAutor()) {
            System.out.println("autor1 e livro.getAutor() apontam para o mesmo objeto.");
        }

        livro.getAutor().setNome("José Lucas");

        System.out.println("Nome em autor1: " + autor1.getNome());
        System.out.println("Nome no autor do livro: " + livro.getAutor().getNome());
    }
}
