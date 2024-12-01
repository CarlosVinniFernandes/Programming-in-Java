import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("escrita.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Esse é o meu arquivo txt muito legal :)\n");
        writer.write(":O");
        writer.close();

        FileReader reader = new FileReader(file);
        int data = reader.read();

        while(data != -1){
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();

    }
}