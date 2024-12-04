import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Processamento p1 = new Processamento();
        Escrita e1 = new Escrita();
        String cep = "";

        while(!cep.equalsIgnoreCase("sair")) {
            System.out.println("---------------------------------");
            System.out.print("Digite um CEP: ");
            cep = sc.nextLine().replace("-","");
            try {
                e1.escritaJson(p1.enviarCeps(cep));
            } catch (Exception e){
                if(!cep.equalsIgnoreCase("sair"))
                        System.out.println("Você digitou um CEP inválido...");
            }
        }
    }
}