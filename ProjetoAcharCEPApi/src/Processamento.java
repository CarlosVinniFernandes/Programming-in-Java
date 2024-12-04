import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Processamento {
    List<Formatador> formatadores = new ArrayList<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public Processamento(){
    }
    public List<Formatador> enviarCeps(String cep) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Formatador f1 = gson.fromJson(response.body(), Formatador.class);
        formatadores.add(f1);
        for(Formatador formatador : formatadores){
            if(cep.equalsIgnoreCase(formatador.getCep().replace("-",""))){
                System.out.println(formatador.toString());
            }
        }
        return formatadores;
    }

    public void mostrarCep(String cep){

    }
}
