package br.com.viacep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite seu CEP:");
        var cep = scanner.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}
