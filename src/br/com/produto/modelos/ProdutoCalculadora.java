package br.com.produto.modelos;

public class ProdutoCalculadora {
    private String nome;
    private double preco;

    public ProdutoCalculadora(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }
    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
