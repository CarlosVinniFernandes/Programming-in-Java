public class App {
    public static void main(String[] args) throws Exception {
        Restaurante r1 = new Restaurante("Ratatouille", "Isaac Elgrably");
        r1.adicionarPrato(new Pratos("Ratatouille", 70));
        r1.adicionarPrato(new Pratos("Lasanha", 50));
        r1.exibirMenu();
        System.out.println(r1.calcularLucro(10));





    }
}
