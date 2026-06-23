package br.edu.ufca.poo.livraria;

public class Ebook extends Livro implements Promocional {
    private String formato;
    private double tamanhoEmMb;

    public Ebook(Autor autor) {
        super(autor);
    }

    public Ebook(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn,
                 String formato, double tamanhoEmMb) {
        super(autor, nome, descricao, valor, numeroPaginas, isbn);
        this.formato = formato;
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        setValor(getValor() - getValor() * porcentagem);
        return true;
    }

    @Override
    void mostrarDetalhes() {
        super.mostrarDetalhes();

        System.out.println("Formato: " + formato);
        System.out.println("Tamanho em MB: " + tamanhoEmMb);
    }

    @Override
    public String getResumo() {
        return "Ebook\n" + super.getResumo();
    }
}
