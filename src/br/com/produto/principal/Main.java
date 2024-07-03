package br.com.produto.principal;

import br.com.produto.modelos.ProdutoCalculadora;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ProdutoCalculadora produto1 = new ProdutoCalculadora("Ar condicionado", 2000.0);
        ProdutoCalculadora produto2 = new ProdutoCalculadora("Aquecedor", 800.0);
        ProdutoCalculadora produto3 = new ProdutoCalculadora("Ventilador", 150.0);


        ArrayList<ProdutoCalculadora> listaProdutos = new ArrayList<>();

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPreco = 0;
        for(ProdutoCalculadora  produto : listaProdutos){
            somaPreco += produto.getPreco();

        }
        double precoMedio = somaPreco / listaProdutos.size();
        System.out.println("Preco Medio dos produto: " + precoMedio);


    }



}

