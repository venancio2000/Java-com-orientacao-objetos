package br.com.venancio.principal.principal;

public class VendaPrincipal {
    public static void main(String[] args) {
        Venda venda1 = new Venda();

        venda1.produto = "Nootebok";
        venda1.quantidade = 1;
        venda1.valorUnitario = 200.50;
        venda1.valorToral = 5000.000;


        System.out.println(venda1.produto);

    }

}
