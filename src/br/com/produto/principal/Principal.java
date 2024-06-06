package br.com.produto.principal;

import br.com.produto.modelos.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var produto1 = new Produto("notebook", 2.300, 1);
        var produto2 = new Produto("tv", 2.30, 8);

        ArrayList<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(produto1);
        listaDeProduto.add(produto2);

        System.out.println("Tamanho da lista: " + listaDeProduto.size());
        System.out.println("Produto na posição 0: " + listaDeProduto.get(0).toString());

    }
}
