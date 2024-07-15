package br.com.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class buscaAPIBitcoin {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin)");
        String nomeDaMoeda = leitura.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids=" +nomeDaMoeda + "&x_cg_demo_api_key=CG-nHhKAkCnxUNgkVAQJoAb77tk";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
