public class EventoSocial extends Evento implements Gerenciavel{
    
    public EventoSocial(String nome, int diaDoEvento) {
        super(nome, diaDoEvento);
    }

    public EventoSocial() {
    }

    @Override
    public void agendarEvento() {
        System.out.println("Este evento foi agendado para o dia " + getDiaDoEvento());
        setStatusDeAgendamento(true);
    }

    @Override
    public void cancelarEvento() {
        if (isStatusDeConfirmacao() == true || isStatusDeAgendamento() == true) {
            System.out.println("O evento social: " + getNome() + " foi cancelado :(");
            setStatusDeConfirmacao(false);
            setStatusDeAgendamento(false);
            System.out.println("Sua presença foi cancelada também");
            setPresenca(false);
        }
        else{
            System.out.println("O Evento já está cancelado!");
        }
    }

    @Override
    public void confirmarPresenca() {
        if (isPresenca() == false) {
            System.out.println("O evento social: " + getNome() + " foi confirmado! Espero por você no dia " + getDiaDoEvento());
            setStatusDeConfirmacao(true);
            setPresenca(true);  
        }
        else{
            System.out.println("Você já está confirmado no evento " + getNome());
        }
    }

}
