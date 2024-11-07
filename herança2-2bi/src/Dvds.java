public class Dvds extends Produtos {
    private double duracao;

    public Dvds(String nome, double preco, int codigoDeBarras, double duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nCódigo de Barras: " + getCodigoDeBarras() + "\nDuração: " + getDuracao() + " minutos");
    }
}
