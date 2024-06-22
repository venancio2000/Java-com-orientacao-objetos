package br.com.conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        CorversoMoedas corversorDolar = new CorversoMoedas();
        System.out.println("Digite o valor da sua prova em Dolar: ");
        double coversor = leitura.nextDouble();
        corversorDolar.converterDolarParaReal(coversor);


    }
}
