package modelos;

public class Podcast extends Audio{
    private int numeroDeEp;
    private int duracaoEp;

    public Podcast(String nome, int numeroDeEp, int duracaoEp) {
        setNome(nome);
        this.numeroDeEp = numeroDeEp;
        this.duracaoEp = duracaoEp;
    }

    public void setNumeroDeEp(int numeroDeEp) {
        this.numeroDeEp = numeroDeEp;
    }

    public void setDuracaoEp(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }

    public int getNumeroDeEp() {
        return numeroDeEp;
    }

    public int getDuracaoEp() {
        return duracaoEp;
    }

    @Override
    public int duracao(){
        return numeroDeEp * duracaoEp;
    }
}
