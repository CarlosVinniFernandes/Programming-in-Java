public class Livros extends Produtos{
    private String autor;

    public Livros(String nome, double preco, int codigoDeBarras, String autor) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: " + getNome() + "\nPreço: R$" + getPreco() + "\nCódigo de Barras: " + getCodigoDeBarras() + "\nAutor: " + getAutor());
    }
}
