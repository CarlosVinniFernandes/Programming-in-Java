public class VeiculoLeve extends Veiculo implements Gerenciavel {

    public VeiculoLeve(String modelo, int anoDeFabricacao, boolean statusDeDisponibilidade) {
        super(modelo, anoDeFabricacao, statusDeDisponibilidade);
    }

    public VeiculoLeve() {
    }

    @Override
    public void alugarVeiculo() {
        if (isStatusDeDisponibilidade()) {
            System.out.println("Este veículo já foi alugado!");
        }
        else{
            System.out.println("Este veículo foi alugado por você!");
            setStatusDeDisponibilidade(true);
        }
    }

    @Override
    public void devolverVeiculo() {
        if (isStatusDeDisponibilidade()) {
            System.out.println("Você devolveu o veículo!");
            setStatusDeDisponibilidade(false);
        }
        else{
            System.out.println("Este veículo não está alugado por ninguém!");
        }
    }
    
}
