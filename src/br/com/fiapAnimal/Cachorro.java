package br.com.fiapAnimal;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo!");
    }
}
