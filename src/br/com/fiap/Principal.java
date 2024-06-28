package br.com.fiap;

public class Principal {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Barrolandinha");
        endereco.setCidade("Planaltina");
        Pessoa pessoa1 = new Pessoa("Bruno Venancio", endereco);
        pessoa1.exibirInf();


    }
}
