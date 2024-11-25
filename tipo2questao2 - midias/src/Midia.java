public class Midia {
    private String titulo;
    private String tipo;
    private int quantidadeEmEstoque;

    public Midia(String titulo, String tipo, int quantidadeEmEstoque) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade){
    }
    public void retirarEstoque(int quantidade){

    }
}
