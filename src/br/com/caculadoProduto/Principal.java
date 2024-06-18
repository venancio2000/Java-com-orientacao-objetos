package br.com.caculadoProduto;

public class Principal {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("computador", 1.500);
        meuProduto.apicarDesconto(10);


        System.out.println("Novo Preço após Desconto: " + meuProduto.getPreco());
    }

}
