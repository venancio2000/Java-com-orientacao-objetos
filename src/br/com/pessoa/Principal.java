package br.com.pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno Venancio");
        pessoa.setIdade(30);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Victor");
        pessoa1.setIdade(11);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Isadora");
        pessoa3.setIdade(4);

        ArrayList<Pessoa> listDePessoa = new ArrayList<>();
        listDePessoa.add(pessoa1);
        listDePessoa.add(pessoa3);
        listDePessoa.add(pessoa);
        System.out.println("primeiro nome: " + listDePessoa.get(0).toString());
        System.out.println(listDePessoa);

    }


}
