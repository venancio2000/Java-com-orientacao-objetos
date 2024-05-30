package br.com.venancio.principal.principal;

import java.util.Scanner;

public class NumerosPositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();

        if(numero >= 1){
            System.out.println("Seu numero " + numero + " e Possitivo");

        }else {
            System.out.println("seu numero e " + numero + " Negativo");
        }


    }
}
