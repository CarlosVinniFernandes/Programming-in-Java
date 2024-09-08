import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int contador = 0;

        System.out.println("Digite um número inteiro positivo: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("O número deve ser positivo.");
            return;
        }

        int c = n;
        while (c != 1) {
            if (c % 2 == 0) {
                c = c / 2;
            } else {
                c = 3 * c + 1;
            }
            contador++;
        }

        System.out.println("O número " + n + " levou " + contador + " passos para chegar a 1.");
    }
}
