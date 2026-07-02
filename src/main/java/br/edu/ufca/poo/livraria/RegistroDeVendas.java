package br.edu.ufca.poo.livraria;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor("Pedro", "62662340339", "gomes.pedro@aluno.ufca.edu.br");
        Editora editora = new Editora("Editora Exemplo", "Editora Exemplo LTDA", "12.345.678/0001-90");

        LivroFisico livroFisico = new LivroFisico(
                autor,
                "Defeito de Cor",
                "Muito legal",
                150,
                930,
                "626",
                "Capa dura"
        );

        Ebook ebook = new Ebook(
                autor,
                "Defeito de Cor",
                "Muito legal",
                60,
                1000,
                "626",
                "PDF",
                200
        );
        Revista revista = new Revista(
                "Tech News",
                "Revista sobre tecnologia",
                25,
                editora
        );

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(livroFisico);
        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);
        carrinho.adiciona(ebook);
        carrinho.adiciona(revista);
        carrinho.adiciona(revista);
        carrinho.adiciona(revista);

        System.out.println("Carrinho antes do desconto:");
        carrinho.imprimirCarrinho();

        carrinho.aplicarPercentualDesconto();

        System.out.println();
        System.out.println("Carrinho depois do desconto:");
        carrinho.imprimirCarrinho();

        carrinho.remove(ebook);

        System.out.println();
        System.out.println("Carrinho depois de remover 1 Ebook:");
        carrinho.imprimirCarrinho();
    }
}
