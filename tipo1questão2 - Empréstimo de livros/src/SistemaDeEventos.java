import java.util.ArrayList;

public class SistemaDeEventos {
    ArrayList<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(Evento evento){
        for(Evento evento2 : eventos){
            if (evento.equals(evento2)) {
                System.out.println("Este evento já foi adicionado!");
                return;
            }
        }
        System.out.println("O evento foi adicionado!");
        eventos.add(evento);
    }

    public void confirmar(String evento){
        for(Evento evento2 : eventos){
            if (evento2.getNome().equals(evento) && evento2.isStatusDeConfirmacao() == true) {
                System.out.println("Você colocou um evento não existente ou já confirmado");
                return;
            }   
            if (evento2.getNome().equals(evento) && evento2.isStatusDeConfirmacao() == false) {
                evento2.confirmarPresenca();
                return;
            }
        }
        System.out.println("Você colocou um evento não existente ou já agendado");
    }

    public void agendar(String evento){
        for(Evento evento2 : eventos){
            if (evento2.getNome().equals(evento) && evento2.isStatusDeConfirmacao() == true) {
                System.out.println("Você colocou um evento não existente ou já agendado");
                return;
            }   
            if (evento2.getNome().equals(evento) && evento2.isStatusDeConfirmacao() == false) {
                evento2.agendarEvento();
                return;
            }
        }
        System.out.println("Você colocou um evento não existente ou já agendado");
    }

    public void cancelar(String evento){
        for(Evento evento2 : eventos){
            if (evento2.getNome().equals(evento) && evento2.isStatusDeAgendamento() == false) {
                System.out.println("Você colocou um evento não existente ou já cancelado");
                return;
            }   
            if (evento2.getNome().equals(evento) && evento2.isStatusDeAgendamento() == true) {
                evento2.cancelarEvento();
                return;
            }
        }
        System.out.println("Você colocou um evento não existente ou já cancelado");
    }

    public void agendados(){
        System.out.println("------------------------------------------");
        for(Evento evento : eventos){
            if (evento.isStatusDeAgendamento() == true) {
                System.out.println("O evento " + evento.getNome() + " está agendado para o dia " + evento.getDiaDoEvento());
            }
            else{
                continue;
            }
        }
    }
}
