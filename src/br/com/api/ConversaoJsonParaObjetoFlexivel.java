package br.com.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjetoFlexivel {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Rodrigo\", \"cidade\":\"Brasilia\" }";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
