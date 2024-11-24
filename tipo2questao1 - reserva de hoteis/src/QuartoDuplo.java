public class QuartoDuplo extends Quarto implements Reservavel {
    
    public QuartoDuplo(int numeroDoQuarto) {
        super(numeroDoQuarto);
    }

    public QuartoDuplo() {
    }

    @Override
    public void reservarQuarto() {
        if (isStatusDeOcupação() == false) {
            System.out.println("O quarto " + getNumeroDoQuarto() + " foi reservado!");
            setStatusDeOcupação(true);
        }
        else{
            System.out.println("Esse quarto ja foi reservado!");
        }
    }

    @Override
    public void cancelarReserva() {
        if (isStatusDeOcupação() == true) {
            System.out.println("O quarto " + getNumeroDoQuarto() + " teve a reserva cancelada!");
            setStatusDeOcupação(false);
        }
        else{
            System.out.println("Esse quarto ja teve sua reserva cancelada!");
        }
    }
    
}
