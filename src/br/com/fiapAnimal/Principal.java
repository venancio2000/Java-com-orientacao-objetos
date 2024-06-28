package br.com.fiapAnimal;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Pretinha");
        Animal gato = new Gato("Gatinho");
        Animal pato = new Pato("Donald");

        cachorro.emitirSom();
        gato.emitirSom();
        pato.emitirSom();

        if(pato instanceof Voador){
            ((Voador) pato).voar();
        }


    }
}
