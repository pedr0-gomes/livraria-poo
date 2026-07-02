package br.edu.ufca.poo.livraria;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto,Integer> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new HashMap<>();
    }
    
    public void adiciona(Produto produto) {
        int quantidadeAtual = this.produtos.getOrDefault(produto,0);
        this.produtos.put(produto, quantidadeAtual+1);
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Produto,Integer> item : this.produtos.entrySet()) {
            Produto produto = item.getKey();
            Integer quantidade = item.getValue();

            total += (produto.getValor())*quantidade;
        }
        return total;
    }

    public Map<Produto,Integer> getProdutos() {
        return produtos;
    }

    public void aplicarPercentualDesconto() {
        for (Produto produto : this.produtos.keySet()) {
            if (produto instanceof Promocional) {
                ((Promocional) produto).aplicaDescontoDe10Porcento();
            }
        }
    }

    public void imprimirCarrinho() {
        System.out.println("Resumo | Quantidade | Valor unitário | Subtotal");
        System.out.println("------------------------------------------------");
        for (Map.Entry<Produto,Integer> item : this.produtos.entrySet()) {
            Produto produto = item.getKey();
            Integer quantidade = item.getValue();
            double subtotal = produto.getValor() * quantidade;
            System.out.println(
                    produto.getResumo() + " | " +
                    quantidade + " | " +
                    produto.getValor() + " | " +
                    subtotal
            );
        }
        System.out.println("------------------------------------------------");
        System.out.println("Valor total da compra: " + this.getTotal());
    }

    public boolean remove(Produto produto) {
        int quantidadeAtual = this.produtos.getOrDefault(produto, 0);

        if (quantidadeAtual == 0) {
            return false;
        }
        if (quantidadeAtual == 1) {
            this.produtos.remove(produto);
        } else {
            this.produtos.put(produto, quantidadeAtual - 1);
        }
        return true;
    }


}
