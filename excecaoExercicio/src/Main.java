import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite outro número");
        int num2 = Integer.parseInt(sc.nextLine());
        try{
            int div = num1/num2;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Você não pode dividir por zero, amiguinho!");
        }


    }
}