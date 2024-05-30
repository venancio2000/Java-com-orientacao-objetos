package br.com.venancio.principal.principal;

public class Format {
    public static void main(String[] args){
        String nome = "bruno";
        int idade = 29;
        double valor = 55.999;
        //System.out.println(String.format("meu nome é %s, eu tenho %d anos, e hoje eu gastei %.2f reais", nome, idade, valor));

        String nomes = "João";
        int aulas = 4;
        String mensagem ="""
                          Olá, %s!
                          Boas vindas as curso de java.
                          Teremos %d audas para te mostrar o que é preciso para você dar mergulho na linguagem Java!
                          """.formatted(nomes, aulas);
        System.out.println(mensagem);
    }
}
