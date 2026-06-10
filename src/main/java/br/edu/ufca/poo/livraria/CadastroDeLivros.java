package br.edu.ufca.poo.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Autor autor = new Autor("Jubileu", "123.456.789-10", "jubileu@gmail.com");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Desbravando Java e Orientação a Objetos");
        livro.setDescricao("Recursos da linguagem");
        livro.setValor(159.90);
        livro.setIsbn("123-45-6789-10-1");
        livro.setNumeroPaginas(100);

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor("Paulo José", "321.654.987-32", "paulojose@gmail.com");

        Livro outroLivro = new LivroFisico(
                outroAutor,
                "Lógica para Programação",
                "Crie seus primeiros programas",
                102.63,
                256,
            "987-65-4321-10-2",
            "Dura"
        );

        outroLivro.mostrarDetalhes();
    }
}
