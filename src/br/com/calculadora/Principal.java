package br.com.calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Carro meuCarro = new Carro();

        System.out.println("Qual seria o modelo do seu veiculo: ");
        meuCarro.modelo = leitura.nextLine();
        System.out.println("Qual seria o Ano do seu veiculo: ");
        meuCarro.ano = leitura.nextInt();
        System.out.println("Qual seria a cor do seu veiculo: ");
        meuCarro.cor = leitura.nextLine();

        meuCarro.exibeFichaTecnica();


    }
}
