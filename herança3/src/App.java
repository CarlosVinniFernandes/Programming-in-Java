public class App {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("Hobbit", 1994, "Livro", "Tolkien", "Fantasia");
        Livro l2 = new Livro("Harry Potter", 1994, "Livro", "JK Rowling", "Fantasia");
        Revista r1 = new Revista("Nature", 2024, "Revista", 5, "Mensal");

        Biblioteca b1 = new Biblioteca();

        b1.adicionarItem(l1);
        b1.adicionarItem(l2);
        b1.adicionarItem(r1);

        b1.listarItens();
        b1.buscarItensPorTipo("Livro");
        b1.contarItensPorTipo("Livro");

    }
}
