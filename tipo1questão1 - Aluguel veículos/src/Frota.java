import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculos(Veiculo veiculo){
        for(Veiculo veiculo2 : veiculos){
            if (veiculo.equals(veiculo2)) {
                System.out.println("Este veículo ja foi adicionado!");
                return;
            }
        }
        System.out.println("O veículo foi adicionado!");
        veiculos.add(veiculo);
    }

    public void alugar(String veiculo){
        for(Veiculo veiculo2 : veiculos){
            if (veiculo2.getModelo().equals(veiculo) && veiculo2.isStatusDeDisponibilidade() == true) {
                System.out.println("Você colocou um veículo não existente ou já alugado");
                return;
            }   
            if (veiculo2.getModelo().equals(veiculo) && veiculo2.isStatusDeDisponibilidade() == false) {
                System.out.println("Seu veículo foi alugado!");
                veiculo2.setStatusDeDisponibilidade(true);
                return;
            }
        }
        System.out.println("Você colocou um veículo não existente ou já alugado");
    }

    public void devolver(String veiculo){
        for(Veiculo veiculo2 : veiculos){
            if (veiculo2.getModelo().equals(veiculo) && veiculo2.isStatusDeDisponibilidade() == false) {
                System.out.println("Você colocou um veículo não existente ou não alugado");
                return;
            }   
            if (veiculo2.getModelo().equals(veiculo) && veiculo2.isStatusDeDisponibilidade() == true) {
                System.out.println("Seu veículo foi devolvido! Obrigado pela empréstimo");
                veiculo2.setStatusDeDisponibilidade(false);
                return;
            }
        }
        System.out.println("Você colocou um veículo não existente ou não alugado");
    }

    public void disponibilidade(){
        System.out.println("------------------------------------------");
        for(Veiculo veiculo : veiculos){
            if (veiculo.isStatusDeDisponibilidade() == false) {
                System.out.println("O veículo " + veiculo.getModelo() + " está disponível!");
            }
            else{
                continue;
            }
        }
    }









}
