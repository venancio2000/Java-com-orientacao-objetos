//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Esse e o Screen Match");
        System.out.println("Filme: Top Gun: maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean icluidoNoPlano = true;
        double notaFilme = 8.1;
        //Média calculada pelas as 3 notas da jack, paulo e bruno
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                 Filme top Gun
                 Filme de aventura com galã dos anos 80
                 Muito bom!
                 ano de lançamento
                 """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}