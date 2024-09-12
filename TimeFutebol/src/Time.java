import java.util.Scanner;

public class Time {
    Scanner sc = new Scanner(System.in);
    String nome;

    Tecnico tec = new Tecnico();

    Torcedor[] torcedores = new Torcedor[5];

    public Time(String nome){
        this.nome = nome;
    }

    public void vincularTecnico(String nome, int anosDeExperiencia){
        tec.nome = nome;
        tec.anosDeExperiencia = anosDeExperiencia;
        System.out.println("O tecnico " + tec.nome + " com " + anosDeExperiencia + " foi vinculado o time " + this.nome);
    }

    public void fichaLista(){
        System.out.println("-------------------------------");
        System.out.println("O time é: " + this.nome);
        System.out.println("Seu tecnico é " + tec.nome);
        System.out.println("Torcedor 1 = " + torcedores[0].nome);
        System.out.println("Torcedor 2 = " + torcedores[1].nome);
        System.out.println("Torcedor 3 = " + torcedores[2].nome);
        System.out.println("Torcedor 4 = " + torcedores[3].nome);
        System.out.println("Torcedor 5 = " + torcedores[4].nome);
        System.out.println("-------------------------------");
    }

    public void atribuirPagamentos(){
        System.out.println("Atribuindo os pagamentos dos sócios do " + this.nome);
        for(int i = 0; i < 5; i++){
            if(torcedores[i] == null || torcedores[i].socio == false){
                continue;
            }
            else{
                System.out.println("Atribuindo pagamentos do torcedor: " + torcedores[i].nome);
                for(int j = 0; j < 4; j++){
                    System.out.println("O torcedor " + torcedores[i].nome + " fez o " + (j+1) +" pagamento?" );
                    boolean resp = sc.nextBoolean();
                    if(resp == true){
                        torcedores[i].pagamentos[j] = true;
                    }
                    else{
                        torcedores[i].pagamentos[j] = false;
                    }
                }
            }
        }
    }


    public void imprimirPagamentos(){
        for(int i = 0; i < 5; i++){
            System.out.println("O torcedor " + torcedores[i].nome + " fez o 1o pagamento?" + torcedores[i].pagamentos[i-1]);
        }
    }
}