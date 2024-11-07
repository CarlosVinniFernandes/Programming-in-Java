public class App {
    public static void main(String[] args) throws Exception {
        Livros l1 = new Livros("Harry Potter", 50, 2020, "JK Rowling");
        Livros l2 = new Livros("Harry Potter 2", 50, 2021, "JK Rowling");
        CDs cd1 = new CDs("The New Abnormal", 20, 3030, 10);
        Dvds dvd1 = new Dvds("Toy Story", 66, 1020, 200);
        Dvds dvd2 = new Dvds("Toy Story 2", 66, 1021, 200);

        Loja loja = new Loja();

        loja.adicionarProdutos(l1);
        loja.adicionarProdutos(l2);
        loja.adicionarProdutos(cd1);
        loja.adicionarProdutos(dvd1);
        loja.adicionarProdutos(dvd2);

        loja.buscadorProdutos(l1);

    }
}
