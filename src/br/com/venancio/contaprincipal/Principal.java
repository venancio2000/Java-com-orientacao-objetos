package br.com.venancio.contaprincipal;
import java.util.Scanner;
import br.com.venancio.banco2000.ContaBancaria;



public class Principal {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        Scanner leitura = new Scanner(System.in);

        //atribuino valor para campp titula
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        minhaConta.setTitula(nome);

        System.out.println("qual será o valor do deposito? ");
        double deposito = leitura.nextDouble();
        minhaConta.depositar(deposito);
        minhaConta.consultarSaldo();
    }
}
