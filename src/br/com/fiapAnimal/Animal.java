package br.com.fiapAnimal;

abstract class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}
