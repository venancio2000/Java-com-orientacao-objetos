package br.com.venancio.principal.principal;

public class MediaNotas {
    public static void main(String[] args){

        double nota1 = 5.0;
        double nota2 = 6.1;
        double media = (nota1 + nota2) /2;

        System.out.println("Media da nota do Bruno " + media);

        int classificacao = (int) media;
        System.out.println("Media Int do alino" + classificacao);

    }
}
