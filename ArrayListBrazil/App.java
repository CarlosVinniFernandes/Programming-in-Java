public class App {
    public static void main(String[] args) throws Exception {
        Brasil brasil1 = new Brasil();

        brasil1.adicionarBrasileiros(new Brasileiro("Carlos"));
        brasil1.adicionarBrasileiros(new Brasileiro("Maria"));

        brasil1.listarBrasileiros();
    }
}
