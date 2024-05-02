import java.util.Scanner;

public class BancoBank {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = "Bruno Venancio";
        String tipoConta = "corrente";
        double saldo = 2500.00;


        String mensagem ="""
                          *****************************************
                          Dados iniciais do cliente:
                          
                          Nome do cliente:  %s
                          Tipo conta:       %s
                          Saldo inicial:    %.2f
                          *****************************************
                          """.formatted(nome, tipoConta, saldo);
        System.out.println(mensagem);
        System.out.println("Operações");

        String operacoes = """
                           1- Consultar Saldos
                           2- Transferir valor
                           3- Receber Valor 
                           4- Sair
                           """;
        System.out.println(operacoes);
        System.out.println("Digite a opção desejada: ");
        int opcao = leitor.nextInt();

        if (opcao == 1){
            System.out.println("saldo da Conta: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Qual valor que deseja transferir");
            double valor = leitor.nextDouble();
            if (valor > saldo){
                System.out.println("Não há saldo para realizar a tranferencia");
            }else{
                saldo -= valor;
                System.out.println("novo saldo " + saldo);
            }
        } else if (opcao == 3) {
            System.out.println("Qual valor recebido: ");
            double valor = leitor.nextDouble();
            saldo += valor;
            System.out.println("Seu novo valor " + saldo);
        }else if (opcao == 4 || opcao != 4){
            System.out.println("voce saiu do sistema");
        }
    }
}