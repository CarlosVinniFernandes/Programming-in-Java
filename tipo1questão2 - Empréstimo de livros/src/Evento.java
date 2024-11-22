public class Evento implements Gerenciavel{
    private String nome;
    private int diaDoEvento;
    private boolean statusDeConfirmacao;
    private boolean statusDeAgendamento;
    private boolean presenca;
   
    public Evento(String nome, int diaDoEvento) {
        this.nome = nome;
        this.diaDoEvento = diaDoEvento;
        this.statusDeConfirmacao = false;
        this.presenca = false;
        this.statusDeAgendamento = true;
    }

    public Evento(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaDoEvento() {
        return diaDoEvento;
    }

    public void setDiaDoEvento(int diaDoEvento) {
        this.diaDoEvento = diaDoEvento;
    }

    public boolean isStatusDeConfirmacao() {
        return statusDeConfirmacao;
    }

    public void setStatusDeConfirmacao(boolean statusDeConfirmacao) {
        this.statusDeConfirmacao = statusDeConfirmacao;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public boolean isStatusDeAgendamento() {
        return statusDeAgendamento;
    }

    public void setStatusDeAgendamento(boolean statusDeAgendamento) {
        this.statusDeAgendamento = statusDeAgendamento;
    }

    @Override
    public void agendarEvento() {
    }

    @Override
    public void cancelarEvento() {
    }

    @Override
    public void confirmarPresenca() {
    }

    

}
