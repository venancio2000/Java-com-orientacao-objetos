package br.com.calculadora;

public class Carro {

    public String modelo;
    public int ano;
    public String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Seu veiculo tem " + calculaIdade() + " anos de uso!!");
    }

    public int calculaIdade(){
        return 2024 - ano;

    }

}
