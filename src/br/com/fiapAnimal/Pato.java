package br.com.fiapAnimal;

public class Pato extends Animal implements Voador{

    // Classe Pato que herda de Animal e implementa a interface Voador
    public Pato(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está gasnando!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voado!");
    }
}
