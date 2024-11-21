import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Frota f1 = new Frota();
        VeiculoPesado v1 = new VeiculoPesado("Ford", 2000, false);
        VeiculoPesado v2 = new VeiculoPesado("Mustang", 2000, false);
        VeiculoPesado v3 = new VeiculoPesado("Ferrari", 2000, false);
        VeiculoLeve v4 = new VeiculoLeve("Moto BMW", 2013, false);
        VeiculoLeve v5 = new VeiculoLeve("Moto Honda", 2013, false);
        VeiculoLeve v6 = new VeiculoLeve("Moto Mercedez", 2013, false);

        f1.adicionarVeiculos(v1);
        f1.adicionarVeiculos(v2);
        f1.adicionarVeiculos(v3);
        f1.adicionarVeiculos(v4);
        f1.adicionarVeiculos(v5);
        f1.adicionarVeiculos(v6);
        
        while(i == 0){
            System.out.println("------------------------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("(1) Alugar veículo");
            System.out.println("(2) Devolver veículo");
            System.out.println("(3) Verificar veículos disponíveis");
            System.out.println("(4) Sair");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Digite o nome do veículo que você deseja alugar:");
                    String escolhaVeiculo = sc.nextLine();
                    f1.alugar(escolhaVeiculo);
                    break;
                case "2":
                    System.out.println("Digite o nome do veículo que você deseja devolver:");
                    String devolverVeiculo = sc.nextLine();
                    f1.devolver(devolverVeiculo);
                    break;
                case "3":
                    f1.disponibilidade();
                    break;
                case "4":
                    System.out.println("Volte sempre!");
                    i = 2;
                    break;           
                default:
                    System.out.println("Digite algo válido!");
                    break;
            }
        }
    }
}
