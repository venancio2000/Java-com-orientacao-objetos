import java.util.Scanner;

public class Balada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("*****************");
        System.out.println("Bem vindo!!!");
        System.out.println("Qual e o seu nome");
        String nome = leitura.next();
        System.out.println(nome + " quantos anos você tem?");
        int idade = leitura.nextInt();
        System.out.println("*****************");

        if(idade >= 18){
            System.out.println(String.format(" %s, o Senhor pode entrar, você e maior de %d anos,", nome, idade));
        }else{
            System.out.println(String.format(" %s, desculpar você e menor de idade", nome));
        }
    }
}
