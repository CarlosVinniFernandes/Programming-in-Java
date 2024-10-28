public class Estagiario extends Funcionario{
    int quantHoras;

    public Estagiario(String nome, int quantHoras) {
        super(nome, quantHoras);
        super.salarioBase = quantHoras*15;
    }
    
    
}
