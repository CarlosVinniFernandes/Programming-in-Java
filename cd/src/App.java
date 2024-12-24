public class App {
    public static void main(String[] args) {
        LojaDeMidias loja = new LojaDeMidias();

        Midia filme1 = new Filme("Isaac Adventures", 10);
        Midia musica1 = new Musica("Casseb - A Origem", 3);

        loja.adicionarMidia(filme1);
        loja.adicionarMidia(musica1);

        loja.listarEstoque();

        loja.retirarMidia("Isaac Adventures", 2);
        loja.retirarMidia("Casseb - A Origem", 5);

        loja.listarEstoque();

        loja.retirarMidia("Isaac Adventures", 2);
    }
}
