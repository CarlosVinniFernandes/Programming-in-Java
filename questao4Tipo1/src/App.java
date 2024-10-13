public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca b1 = new Biblioteca("Biblioteca do Cesupa", "Pedro Girotto");
        b1.adicionarLivro(new Livro("Casseb's Adventures"));
        b1.adicionarLivro(new Livro("Girotto's Adventures"));
        b1.adicionarLivro(new Livro("Alessandra's Adventures"));
        b1.livrosDisponiveis();
        b1.emprestarLivro("Alessandra's Adventures");
        b1.livrosDisponiveis();
    }
}
