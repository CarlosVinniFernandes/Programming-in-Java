public class Revista extends ItemBiblioteca{
    private int edicao;
    private String periodicidade;
    
    public Revista(String titulo, int anoPublicacao, String tipoItem, int edicao, String periodicidade) {
        super(titulo, anoPublicacao, tipoItem);
        this.edicao = edicao;
        this.periodicidade = periodicidade;
    }

    public Revista() {
    }

    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public String getPeriodicidade() {
        return periodicidade;
    }
    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + "edicao: " + getEdicao() + "\nperiodicidade: " + getPeriodicidade();
    }
    
}
