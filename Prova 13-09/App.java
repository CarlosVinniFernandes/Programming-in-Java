public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Biblioteca bib1 = new Biblioteca();
        
        Livro liv1 = new Livro("Harry Potter");
        Livro liv2 = new Livro("Percy Jackson");
        Livro liv3 = new Livro("Maze Runner");
        Livro liv4 = new Livro("The Last of Us");
        Livro liv5 = new Livro("Python para baixinhos");

        bib1.livro[0] = liv1;
        bib1.livro[1] = liv2;
        bib1.livro[2] = liv3;
        bib1.livro[3] = liv4;
        bib1.livro[4] = liv5;

        
        bib1.vincularLivros();

        bib1.Bibliotecario("Isaac", "Gênio do Java", "(91)98252-0853");
        bib1.imprimirFicha();


    }
}
