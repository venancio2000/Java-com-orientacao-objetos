import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o numero da sua multiplicação: ");
        int numero = leitor.nextInt();


        System.out.println("Seu numero digitado foi: " + numero);
        System.out.println("------------------------------");

        for (int i = 0; i <= 10; i++) {

            System.out.println( numero + " X " + i + " = " + (numero * i));
        }

    }
}

