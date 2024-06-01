package br.com.venancio.banco2000;

public class ContaBancaria {
    private String titula;
    private int conta;
    private double saldo;
    private double deposito;

    public String getTitula() {
        return titula;
    }
    public void setTitula(String titula){
        this.titula = titula;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Dépósito de R$ " + valor + " realizado com sucesso");
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de : " + valor + " realizado na sua conta: ");
        }else{
            System.out.println("Saldo insuficiente para saque.");
        }

    }
    public void consultarSaldo() {
        System.out.println(String.format("Srº %s o saldo da sua conta e : %.2f ", titula, saldo));
    }



}
