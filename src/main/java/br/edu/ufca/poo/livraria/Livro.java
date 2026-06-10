package br.edu.ufca.poo.livraria;

public abstract class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private int numeroPaginas;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-0000-00-0";
        System.out.println("Livro criado com sucesso!");
    }

    public Livro(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn) {
        this.autor = autor;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        System.out.println("Livro criado com sucesso!");
    }

    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);

        autor.mostrarDetalhes();
    }

    public abstract boolean aplicaDescontoDe(double porcentagem);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
