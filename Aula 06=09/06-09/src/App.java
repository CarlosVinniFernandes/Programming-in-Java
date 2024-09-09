public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Livro l1 = new Livro();
        l1.aberto = true;

        l1.abrirLivro();
        l1.fecharLivro();
        System.out.println(l1.aberto);
    }
}
