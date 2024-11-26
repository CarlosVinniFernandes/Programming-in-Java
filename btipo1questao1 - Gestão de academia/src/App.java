import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Academia a1 = new Academia();
        a1.addAtividade(new AtividadeMusculacao("Supino Reto", 10, 5));
        a1.addAtividade(new AtividadeMusculacao("Supino Inclinado", 10, 4));
        a1.addAtividade(new AtividadeMusculacao("Voador", 10, 1));
        a1.addAtividade(new AtividadeCardio("Esteira", 10, 1));
        a1.addAtividade(new AtividadeCardio("Bike", 10, 1));
        a1.addAtividade(new AtividadeCardio("Danca", 10, 1));

        
        while(i == 0){
            System.out.println("------------------------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("(1) Iniciar Atividade");
            System.out.println("(2) Finalizar atividade");
            System.out.println("(3) Verificar atividades em andamento");
            System.out.println("(4) Criar rotina personalizada");
            System.out.println("(5) Sair");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    a1.iniciarAtividade();
                    break;
                case "2":
                    a1.finalizarAtividade();
                    break;
                case "3":
                    a1.listarAtividades();;
                    break;
                case "4":
                    a1.criarRotina();
                    break;
                case "5":
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
