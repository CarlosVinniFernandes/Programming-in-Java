package modelos;

public class Podcast extends Audio {
    private int numeroDeEp;
    private int duracaoEp;

    public Podcast(String nome, int duracao, int totalVisu, int curtidas, int classificao, int numeroDeEp, int duracaoEp) {
        super(nome, duracao, totalVisu, curtidas, classificao);
        this.numeroDeEp = numeroDeEp;
        this.duracaoEp = duracaoEp;
    }
    public int getNumeroDeEp() {
        return numeroDeEp;
    }

    public int getDuracaoEp() {
        return duracaoEp;
    }
}
