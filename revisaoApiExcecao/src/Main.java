import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String place = sc.nextLine().replace(" ", "+");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.meteosource.com/api/v1/free/point?place_id="+ place +"&sections=all&timezone=UTC&language=en&units=metric&key=e3caehgwsricxdk0c3karhei8i20g1628x84znb1"))
                .build();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        PrevisaoDeTemperatura result = gson.fromJson(response.body(), PrevisaoDeTemperatura.class);

        System.out.println(response.body());
        System.out.println("------------------------------");

        System.out.println("A atual temperatura de " + place.substring(0,1).toUpperCase() + place.substring(1));
        for(PrevisaoDeTemperatura.HourlyData data : result.getHourly().getData()){
            System.out.println("Data: " + data.getDate().replace("-", "/").replace("T", " Hora:"));
            System.out.println("Temperatura: " + data.getTemperature());
            System.out.println("-------------------------");
        }

    }
}