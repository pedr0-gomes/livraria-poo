package br.edu.ufca.poo.livraria;

public class TestaCustoEnvio {
    public static void main(String[] args) {
        Autor autor = new Autor("Autor Teste", "000.000.000-00", "autor.teste@email.com");

        LivroFisico livroFisico = new LivroFisico(
                autor,
                "Livro Fisico de Teste",
                "Livro usado para testar o custo de envio",
                120.0,
                250,
                "123-45-6789-10-1",
                "Brochura"
        );

        System.out.println("Numero de paginas: " + livroFisico.getNumeroPaginas());
        System.out.println("Custo de envio: R$ " + livroFisico.calcularCustoEnvio());
    }
}
