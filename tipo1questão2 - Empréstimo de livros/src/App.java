import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        SistemaDeEventos s1 = new SistemaDeEventos();
        s1.adicionarEvento(new EventoSocial("Show da Prefeitura", 23));
        s1.adicionarEvento(new EventoSocial("Evento Beneficente", 29));
        s1.adicionarEvento(new EventoSocial("Papai Noel no Shopping", 3));
        s1.adicionarEvento(new EventoSocial("Palestra no Cesupa", 10));
        s1.adicionarEvento(new EventoSocial("Meeting com Suze Oliveira", 15));
        s1.adicionarEvento(new EventoSocial("Isaac reunioes", 20));
        
        while(i == 0){
            System.out.println("------------------------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("(1) Agendar evento");
            System.out.println("(2) Cancelar evento");
            System.out.println("(3) Confirmar evento");
            System.out.println("(4) Verificar eventos disponíveis");
            System.out.println("(5) Sair");
            String escolha = sc.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("Você deseja um evento social(1) ou corporativo(2)?");
                    String resposta = sc.nextLine();
                    if (resposta.equals("1")) {
                        System.out.println("Digite o nome do evento social que você deseja agendar:");
                        String nomeEventoAgendado = sc.nextLine();
                        System.out.println("Digite o dia do evento social que você vai agendar");
                        int diaDoEventoAgendado = Integer.parseInt(sc.nextLine());
                        s1.adicionarEvento(new EventoSocial(nomeEventoAgendado, diaDoEventoAgendado));
                    }
                    else if(resposta.equals("2")){
                        System.out.println("Digite o nome do evento corporativo que você deseja agendar:");
                        String nomeEventoAgendado = sc.nextLine();
                        System.out.println("Digite o dia do evento corporativo que você vai agendar");
                        int diaDoEventoAgendado = Integer.parseInt(sc.nextLine());
                        s1.adicionarEvento(new EventoSocial(nomeEventoAgendado, diaDoEventoAgendado));
                    }
                    else{
                        System.out.println("Digite algo válido!");
                    }

                    break;
                case "2":
                    System.out.println("Digite o nome do evento que você deseja cancelar:");
                    String nomeEventoCancelado = sc.nextLine();
                    s1.cancelar(nomeEventoCancelado);
                    break;
                case "3":
                    System.out.println("Digite o nome do evento que você deseja confirmar:");
                    String nomeEventoConfirmado = sc.nextLine();
                    s1.confirmar(nomeEventoConfirmado);
                    break;
                case "4":
                    s1.agendados();
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
