public class CadatrarConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Bruno Venancio";
        conta1.setNumeroConta("4578-5");
        conta1.setSaldo(4.500);

        //System.out.println("Senhor(a) " + conta1.titular);

        String mensagem = """
                          ###################################
                          Senhor(a) %s.
                          O numero da sua nova Conta e: %s
                          Com o saldo inicial de: %.3f
                          ###################################
                          """.formatted(conta1.titular, conta1.getNumeroConta(), conta1.getSaldo());

        System.out.println(mensagem);

    }


}
