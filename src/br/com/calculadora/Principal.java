package br.com.calculadora;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fiesta";
        meuCarro.ano = 2015;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();


    }
}
