public class CDs extends Produtos {
    private int numeroDeFaixas;

    public CDs(String nome, double preco, int codigoDeBarras, int numeroDeFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nCódigo de Barras: " + getCodigoDeBarras() + "Número de faixas: " + getNumeroDeFaixas());
    }
}
