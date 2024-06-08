package br.com.produto.principal;

import java.util.ArrayList;

public class PecorrerLista {



    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

        //for (String nome : nomes) {
        //    System.out.println(nome);
        //}

        //nomes.forEach(nome -> System.out.println(nome));

        nomes.forEach(System.out::println);

    }


}
