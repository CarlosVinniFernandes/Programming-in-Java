public class App {
    public static void main(String[] args) throws Exception {
        Hotel h1 = new Hotel();

        h1.adicionarQuarto(new QuartoIndividual(250), "verao");
        h1.adicionarQuarto(new QuartoIndividual(1010), "inverno");
        h1.adicionarQuarto(new QuartoIndividual(2020), "primavera");

        h1.adicionarQuarto(new QuartoDuplo(300), "verao");
        h1.adicionarQuarto(new QuartoDuplo(400), "inverno");
        h1.adicionarQuarto(new QuartoDuplo(500), "primavera");

        h1.cancelarReserva(300);
        h1.cancelarReserva(250);

        h1.calcularReceita();
    }
}
