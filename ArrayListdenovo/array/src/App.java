import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Brasil b1 = new Brasil("Pará");

        System.out.println("Quantos brasileiros você quer criar?");
        int n = sc.nextInt();
        sc.nextLine();
        
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite o nome e cpf");
            String nome = sc.nextLine();
            int cpf = sc.nextInt();
            sc.nextLine();    
            b1.criarBrasileiros(new Brasileiro(nome, cpf));
        }
    
        b1.mostrarBrasileiros();
    }
}
