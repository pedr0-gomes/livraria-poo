package br.edu.ufca.poo.livraria;

public class ComparandoReferencias {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.nome = "Luana Batista";
        autor1.cpf = "123.321.456-78";
        autor1.email = "luana.batista@ufca.edu.br";

        Autor autor2 = new Autor();
        autor2.nome = "Luana Batista";
        autor2.cpf = "123.321.456-78";
        autor2.email = "luana.batista@ufca.edu.br";

        Livro livro = new Livro();
        livro.autor = autor1;

        livro.autor.nome = "José Lucas";

        System.out.println(autor1.nome);

        if (autor1 == autor2) {
            System.out.println("Iguais!");
        } else {
            System.out.println("São diferentes!");
        }
    }
}
