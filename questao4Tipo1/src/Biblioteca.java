import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private String responsavel;

    public Biblioteca(String nome, String responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.livros = new ArrayList<>();
    }

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void livrosDisponiveis() {
        System.out.println("-----------Livros Disponíveis-----------");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println("Nome: " + livro.getNome());
            }
        }
        System.out.println("----------------------------------------");
    }

    public void emprestarLivro(String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNome().equals(nomeLivro) && livro.estaDisponivel()) {
                livro.setDisponivel(false);
                System.out.println("O livro " + nomeLivro + " foi emprestado.");
                return;
            }
        }
        System.out.println("O livro " + nomeLivro + " não está disponível.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}