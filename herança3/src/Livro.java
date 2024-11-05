public class Livro extends ItemBiblioteca{
    private String autor;
    private String genero;
    
    public Livro(String titulo, int anoPublicacao, String tipoItem, String autor, String genero) {
        super(titulo, anoPublicacao, tipoItem);
        this.autor = autor;
        this.genero = genero;
    }

    public Livro(String autor, String genero) {
        this.autor = autor;
        this.genero = genero;
    }

    public Livro(){
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String exibirDetalhes() {
        return super.exibirDetalhes() + "autor: " + getAutor() + "\ngênero: " + getGenero();
    }

    
}
