import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotal = 0;

        while (nota != -1) {
            System.out.println("diga sua avaliação para o filme oi -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotal++;
            }

        }

        System.out.println("Media de avaliações " + mediaAvaliacao / totalDeNotal);
    }
}
