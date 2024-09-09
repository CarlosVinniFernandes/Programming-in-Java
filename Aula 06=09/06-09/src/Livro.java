public class Livro {
    String nome;
    int paginas;
    String autor;
    String categoria;
    boolean aberto;
    double preço;

    public void abrirLivro(){
        if(this.aberto == false){
            this.aberto = true;
        }
        else{
            System.out.println("O livro está aberto!");
        }
    }

    public void fecharLivro(){
        if(this.aberto == true){
            this.aberto = false;
        }
        else{
            System.out.println("O livro está fechado!");
        }
    }

    



}
