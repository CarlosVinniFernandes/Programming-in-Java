import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int min = 20;  
        int max = 30;   

        Random random = new Random();

        int randomNumber = random.nextInt(30) + 20;

        System.out.println("Número aleatório gerado: " + randomNumber);
    }
}
