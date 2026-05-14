package br.edu.ufca.poo.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Jubileu";
        autor.cpf = "123.456.789-10";
        autor.email = "jubileu@gmail.com";

        Livro livro = new Livro();
        livro.nome = "Desbravando Java e Orientação a Objetos";
        livro.descricao = "Recursos da linguagem";
        livro.valor = 159.90;
        livro.isbn = "123-45-6789-10-1";
        livro.numeroPaginas = 100;
        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo José";
        outroAutor.email = "paulojose@gmail.com";
        outroAutor.cpf = "321.654.987-32";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica para Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 102.63;
        outroLivro.isbn = "987-65-4321-10-2";
        outroLivro.numeroPaginas = 256;
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();
    }
}
