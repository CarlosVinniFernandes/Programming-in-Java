import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        var pedido = scanner.nextLine();

        var resposta = "https://www.googleapis.com/books/v1/volumes?q=" + pedido;
        if(pedido.contains(" ")){
            resposta = resposta.replace(" ", "+").toLowerCase();
        }

        HttpClient cliente  = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(resposta))
                .build();

        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}