import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Escrita {
    public Escrita() throws IOException {
    }


    public void escritaJson(List<Formatador> formatadores) throws IOException {
        FileWriter writer = new FileWriter("Ceps.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        writer.write(gson.toJson(formatadores));
        writer.close();
    }
}
