public class Atividade {
    private String nome;
    private int duracaoMinutos;
    private double nivelDeDificuldade;
    private double quantidadeDeMusculo = 20;
    private double quantidadeDeGordura = 50;
    private boolean usado = false;
    
    public Atividade(String nome, int duracaoMinutos, double nivelDeDificuldade) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.nivelDeDificuldade = nivelDeDificuldade;
    }

    public Atividade(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }

    public void setNivelDeDificuldade(double nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }

    public double getQuantidadeDeMusculo() {
        return quantidadeDeMusculo;
    }

    public void setQuantidadeDeMusculo(double quantidadeDeMusculo) {
        this.quantidadeDeMusculo = quantidadeDeMusculo;
    }

    public double getQuantidadeDeGordura() {
        return quantidadeDeGordura;
    }

    public void setQuantidadeDeGordura(double quantidadeDeGordura) {
        this.quantidadeDeGordura = quantidadeDeGordura;
    }
    
    public void iniciarAtividade(){}
    public void finalizarAtividade(){}

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    
}
