import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas < 5){
            System.out.println("Digite o numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroGerado == numeroDigitado){
                System.out.println("Parabens, você acertou o numero em " + tentativas + " tentativas!");
                break; // interrimpe o loop while
            }else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o gerado");
            }else {
                System.out.println("O número digitado é maior que o gerado");
            }
        }
        if (tentativas == 5 && numeroDigitado != numeroGerado){
            System.out.println("você não acertou o numero gerado em 05 tentativas. O numero era: " + numeroGerado);
        }


    }
}
