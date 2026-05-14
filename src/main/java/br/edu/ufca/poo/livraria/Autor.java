package br.edu.ufca.poo.livraria;

public class Autor {
    String nome;
    String cpf;
    String email;

    public Autor() {
        System.out.println("Autor criado com sucesso!");
    }

    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }
}
