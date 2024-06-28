package br.com.fiap;

public class Pessoa extends Endereco{

    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void exibirInf(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("Cidade: " + this.endereco.getCidade());
    }
}
