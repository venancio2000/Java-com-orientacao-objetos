package br.com.conversor;

public class CorversoMoedas implements ConversaoFinanceira{


    @Override
    public void converterDolarParaReal(double valorDolar) {
        double contacao = 5.44;
        double valorReal = valorDolar * contacao;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
