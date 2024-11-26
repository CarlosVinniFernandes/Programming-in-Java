import java.util.ArrayList;
import java.util.Scanner;

public class Academia {
    Scanner sc = new Scanner(System.in);
    ArrayList<Atividade> atividades = new ArrayList<>();
    ArrayList<Atividade> treinoPersonalizado = new ArrayList<>();
    private double quantidadeDeMusculo = 20;
    private double quantidadeDeGordura = 50;

    public void addAtividade(Atividade atividade){
        atividades.add(atividade);
    }

    public void listarAtividades(){
        for(Atividade atividade : treinoPersonalizado){
            if(atividade.isUsado() == true){
                System.out.println("Você já treinou a atividade: " + atividade.getNome());
            }
        }

        for(Atividade atividade : treinoPersonalizado){
            if(atividade.isUsado() == false){
                System.out.println("Falta treinar as atividades: " + atividade.getNome());
            }
        }
        System.out.println("----------------------------------------------");
    }

    public void criarRotina(){
        System.out.println("Atividades disponíveis: ");
        for(Atividade atividade2 : atividades){
            System.out.println("[" + atividades.indexOf(atividade2) + "]" + atividade2.getNome());
        }
        System.out.println("Qual atividade você deseja adicionar? Selecione o index");
        String escolha = sc.nextLine();
        
        if(Integer.parseInt(escolha) >= 0 && Integer.parseInt(escolha) < atividades.size()){
            treinoPersonalizado.add(atividades.get(Integer.parseInt(escolha)));
            atividades.remove(atividades.get(Integer.parseInt(escolha)));
        }
        else{
            System.out.println("Coloque um treino válido");
        }
    }

        public void iniciarAtividade(){
            System.out.println("Atividades disponíveis: ");
            for(Atividade atividade2 : treinoPersonalizado){
                if(atividade2.isUsado() == false){
                    System.out.println("[" + treinoPersonalizado.indexOf(atividade2) + "]" + atividade2.getNome());
                }
            }
            System.out.println("Qual atividade você deseja treinar? Selecione o index");
            String escolha = sc.nextLine();
        
            if(Integer.parseInt(escolha) >= 0 && Integer.parseInt(escolha) < treinoPersonalizado.size() && treinoPersonalizado.get(Integer.parseInt(escolha)).isUsado() == false){
                treinoPersonalizado.get(Integer.parseInt(escolha)).iniciarAtividade();
            }
            else{
                System.out.println("Coloque um treino válido");
            }
        
        
        
        
        
        }

        public void finalizarAtividade(){
            System.out.println("Atividades iniciadas: ");
            for(Atividade atividade2 : treinoPersonalizado){
                if(atividade2.isUsado() == true){
                    System.out.println("[" + treinoPersonalizado.indexOf(atividade2) + "]" + atividade2.getNome());
                }
            }
            System.out.println("Qual atividade você deseja finalizar? Selecione o index");
            String escolha = sc.nextLine();
        
            if(Integer.parseInt(escolha) >= 0 && Integer.parseInt(escolha) < treinoPersonalizado.size() && treinoPersonalizado.get(Integer.parseInt(escolha)).isUsado() == true){
                treinoPersonalizado.get(Integer.parseInt(escolha)).finalizarAtividade();
                if(treinoPersonalizado.get(Integer.parseInt(escolha)) instanceof AtividadeMusculacao){
                    System.out.println("Você está ganhando massa muscular! antes tinha: " + quantidadeDeMusculo);
                    quantidadeDeMusculo += 1;
                    System.out.println("Agora tem: " + quantidadeDeMusculo);
                }
                else{
                    System.out.println("Você está ganhando perdendo gordura! antes tinha: " + quantidadeDeGordura);
                    quantidadeDeGordura -= 1;
                    System.out.println("Agora tem: " + quantidadeDeGordura);
                }
                treinoPersonalizado.remove(treinoPersonalizado.get(Integer.parseInt(escolha)));
            }
            else{
                System.out.println("Coloque um treino válido");
            }
        }

    }

