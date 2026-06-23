package br.edu.ufca.poo.livraria;

public class Editora {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public Editora() {

    }

    public Editora(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome fantasia: " + this.nomeFantasia);
        System.out.println("Razão social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
