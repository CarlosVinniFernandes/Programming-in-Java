import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //{1,1,2,3,5,8,13,21,34,55,89,144,233,377,...}

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = sc.nextInt();
        //sc.nextInt();
        int fibo[] = new int[100];
        fibo[0] = 1;
        fibo[1] = 1;


        int vetor[] = new int[valor];

        for(int i = 2; i <= valor; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(fibo[valor-1]);

    }
}
