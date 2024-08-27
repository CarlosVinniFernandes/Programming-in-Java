package modelos;

public class Audio {
    private String nome;
    private int duracao;
    private int totalVisu;
    private int curtidas;
    private int classificao;
    
    public Audio(String nome, int duracao, int totalVisu, int curtidas, int classificao) {
        this.nome = nome;
        this.duracao = duracao;
        this.totalVisu = totalVisu;
        this.curtidas = curtidas;
        this.classificao = classificao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalVisu() {
        return totalVisu;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificao() {
        return classificao;
    }
    
    
    
}
