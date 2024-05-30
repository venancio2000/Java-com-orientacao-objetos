package br.com.venancio.principal.principal;

import br.com.venancio.banco2000.ContaBancaria;
public class ContaTitula {
    public static void main(String[] args){

        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setTitula("Bruno Venancio");
        System.out.println("Ola SRº " + minhaConta.getTitula());

        minhaConta.depositar(300);
        minhaConta.sacar(200);
        minhaConta.consultarSaldo();
    }
}
