package br.com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumeroInteiro {
    public static void main(String[] args) {

    List<String> lista = new ArrayList<>();
        lista.add("6");
        lista.add("8");
        lista.add("4");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
