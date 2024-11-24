public class Quarto {
    private int numeroDoQuarto;
    private boolean tipo;
    private boolean statusDeOcupação = true;
    private String temporada;
    
    
    public Quarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Quarto() {       
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }
    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }
    public boolean isTipo() {
        return tipo;
    }
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    public boolean isStatusDeOcupação() {
        return statusDeOcupação;
    }
    public void setStatusDeOcupação(boolean statusDeOcupação) {
        this.statusDeOcupação = statusDeOcupação;
    }
    
    public void reservarQuarto() {
    }

    public void cancelarReserva() {
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }


    

}
