package modelos;

public class Audio {
    private String nome;
    private int duracao;
    private int totalVisu;
    private int curtidas;
    private int classificao;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getTotalVisu() {
        return totalVisu;
    }
    public void setTotalVisu(int totalVisu) {
        this.totalVisu = totalVisu;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public int getClassificao() {
        return classificao;
    }
    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public int duracao(){
        return duracao;
    }
    
}
