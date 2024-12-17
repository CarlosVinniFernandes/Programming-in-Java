public class App {
    public static void main(String[] args) throws Exception {
        Garagem garagem = new Garagem();

        Veiculo carro = new Carro("Tesla", "Model x", 80000);
        Veiculo moto = new Moto("BMW", "BMW 1", 35000);
        Veiculo caminhao = new Caminhao("Volvo", "FH", 250000);

        garagem.adicionarVeiculo(carro);
        garagem.adicionarVeiculo(moto);
        garagem.adicionarVeiculo(caminhao);

        System.out.println("Veículos na garagem:");
        garagem.listarVeiculos();

        double totalImpostos = garagem.calcularTotalImpostos();
        System.out.println("Total de impostos a pagar: R$ " + totalImpostos);
    }
}
