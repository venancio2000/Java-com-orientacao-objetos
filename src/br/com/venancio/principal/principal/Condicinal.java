package br.com.venancio.principal.principal;

public class Condicinal {
    public static void main(String[] args) {

        int anoDeLancamento = 1998;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locaçao");
        }

    }
}
