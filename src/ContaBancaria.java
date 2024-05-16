public class ContaBancaria {
    public String titular;
    private String numeroConta;
    private double saldo;

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
