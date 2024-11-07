public class Produtos {
    private String nome;
    private double preco;
    private int codigoDeBarras;
   
    public Produtos(String nome, double preco, int codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nCódigo de Barras: " + getCodigoDeBarras());
    }

    
    


    
}
