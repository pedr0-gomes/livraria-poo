package br.edu.ufca.poo.livraria;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor("Pedro", "62662340339", "gomes.pedro@aluno.ufca.edu.br");

        Livro livroFisico = new LivroFisico(
                autor,
                "Defeito de Cor",
                "Muito legal",
                150,
                930,
                "626",
                "Capa dura"
        );

        Livro ebook = new Ebook(
                autor,
                "Defeito de Cor",
                "Muito legal",
                60,
                1000,
                "626",
                "PDF",
                200
        );
    
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        System.out.println("O total no seu carrinho de compra é R$" + carrinho.getTotal());

    }
}
