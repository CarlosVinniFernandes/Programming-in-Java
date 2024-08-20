import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conversao c = new Conversao();
        Scanner input = new Scanner(System.in);
       
        while (true) {
            System.out.println("Escolha a opção de conversão:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Celsius para Kelvin");
            System.out.println("4. Kelvin para Celsius");
            System.out.println("5. Celsius para Réaumur");
            System.out.println("6. Réaumur para Celsius");
            System.out.println("7. Kelvin para Rankine");
            System.out.println("8. Rankine para Kelvin");
            System.out.println("9. Sair");

            int escolha = input.nextInt();

            if (escolha == 1){
                System.out.println("Digite a temperatura: ");
                double temperatura = input.nextDouble();

                c.celsiusFahrenheit(temperatura);
                System.out.println(c.celsiusFahrenheit(temperatura));
            }
            
            if (escolha == 9) {
                System.out.println("Saindo...");
                break;
            }

            if (escolha < 1 || escolha > 9) {
                System.out.println("Escolha inválida, tente novamente.");
                continue;
            }

            input.close();
        }
    }
}
