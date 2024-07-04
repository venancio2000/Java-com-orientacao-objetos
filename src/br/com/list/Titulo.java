package br.com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNome().compareTo(outroTitulo.getNome());
    }

    public static void main(String[] args) {
        Titulo nome1 = new Titulo("Venancio");
        Titulo nome2 = new Titulo("Bruno");
        Titulo nome3 = new Titulo("Silva");


        List<Titulo> listaDeNomes = new ArrayList<>();
        listaDeNomes.add(nome1);
        listaDeNomes.add(nome2);
        listaDeNomes.add(nome3);
        System.out.println(listaDeNomes);
        System.out.println("------ For -------");
        for (Titulo nome : listaDeNomes){
            System.out.println(nome);
        }
        System.out.println("------ Ondenação -------");
        Collections.sort(listaDeNomes);
        System.out.println("Nomes ondenado : " + listaDeNomes);
        //ollections.sort(Comparator.comparing(listaDeNomes.));
    }


}
