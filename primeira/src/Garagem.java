import java.util.ArrayList;
import java.util.List;

class Garagem {
    private List<Veiculo> veiculos;

    public Garagem() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public double calcularTotalImpostos() {
        double total = 0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.calcularImposto();
        }
        return total;
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getClass().getSimpleName() + " - " + veiculo.getMarca() + " " + veiculo.getModelo());
        }
    }
}