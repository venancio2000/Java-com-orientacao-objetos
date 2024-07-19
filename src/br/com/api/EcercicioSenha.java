package br.com.api;

import java.util.Scanner;

public class EcercicioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();


        try {
            validaSenha(senha);
            System.out.println("Senha valida. Acesso permitido.");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    private static void validaSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve ter pelo menis 8 caracteres.");
        }
    }
}
