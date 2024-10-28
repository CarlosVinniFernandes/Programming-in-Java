public class Funcionario {
    String nome;
    double salarioBase;
   
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
   
    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularSalario(){
        System.out.println("O salário de " + this.nome + " é igual a: " + this.salarioBase);
    }


    
}
