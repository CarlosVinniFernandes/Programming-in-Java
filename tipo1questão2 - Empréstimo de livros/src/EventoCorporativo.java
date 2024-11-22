public class EventoCorporativo extends Evento implements Gerenciavel{
    
    public EventoCorporativo(String nome, int diaDoEvento) {
        super(nome, diaDoEvento);
    }

    public EventoCorporativo() {
    }

    @Override
    public void agendarEvento() {
        System.out.println("Este evento foi agendado para o dia " + getDiaDoEvento());
        setStatusDeAgendamento(true);
    }

    @Override
    public void cancelarEvento() {
        if (isStatusDeConfirmacao() == true) {
            System.out.println("O evento corporativo: " + getNome() + " foi cancelado :(");
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
            System.out.println("O evento corporativo: " + getNome() + " foi confirmado! Espero por você no dia " + getDiaDoEvento());
            setStatusDeConfirmacao(true);
            setPresenca(true);  
        }
    }

}
