public class Gerente extends Funcionario{
    double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public void calcularSalario(){
        setSalarioBase(getSalarioBase() + bonus);
        System.out.println("Seu gerente recebeu um bonus de " + bonus + "!");
        System.out.println("O salário de " + this.nome + " é igual a: " + this.salarioBase);
    }
    
    
}
