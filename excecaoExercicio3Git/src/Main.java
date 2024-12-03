import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = sc.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/search/users?q=" + nome))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());
        System.out.println("--------------------------");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        GitHubSearchResult result = gson.fromJson(response.body(), GitHubSearchResult.class);
        try {
            validadorConta(result.getTotalCount());
            System.out.println("Total de resultados: " + result.getTotalCount());
            System.out.println("Usuários encontrados: ");
            File file = new File("Usuarios Encontrados.txt");
            FileWriter writer = new FileWriter(file);

            for (GitHubSearchResult.GitHubUser user : result.getUsers()) {
                writer.write("Login: " + user.getLogin() + "\n");
                writer.write("URL: " + user.getUrl() + "\n");
                writer.write("Foto: " + user.getAvatarUrl() + "\n");
                writer.write("------------------------------------\n");
                System.out.println("Login: " + user.getLogin());
                System.out.println("URL: " + user.getUrl());
                System.out.println("Foto: " + user.getAvatarUrl());
                System.out.println("------------------");
            }
            writer.close();

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMensagem());
        }

    }
    public static void validadorConta(int quantidadeDeContas) {
        if (quantidadeDeContas == 0) {
            throw new ErroConsultaGitHubException("Sua busca teve 0 contas");
        }
    }
}