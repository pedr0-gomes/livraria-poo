package br.edu.ufca.poo.livraria;

public class LivroFisico extends Livro {
    private String tipoCapa;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public LivroFisico(Autor autor, String nome, String descricao, double valor, int numeroPaginas, String isbn,
                       String tipoCapa) {
        super(autor, nome, descricao, valor, numeroPaginas, isbn);
        this.tipoCapa = tipoCapa;
    }


    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    @Override
    void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo de Capa: " + tipoCapa);
    }

    public double calcularCustoEnvio() {
        return getNumeroPaginas() * 0.08;
    }

    @Override 
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }

        setValor(getValor() - getValor()*porcentagem);
        return true;
    }
    
}
