import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        titulos.add(new Titulo("Breaking Bad", 50, 5, 9, 100));
        titulos.add(new Titulo("Better Call Saul", 50, 5, 9, 100));

        FileWriter writer = new FileWriter("Titulo.json");
        gson.toJson(titulos,writer);
        writer.close();

    }
}