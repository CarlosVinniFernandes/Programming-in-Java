public class Vendedor {
    private String nome;
    private double salarioBase;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public Vendedor(){
    }

    public double calcularSalarioComComissao(){
        return salarioBase + comissao;
    }

    public void venderProduto(double valor){
        comissao += valor * (comissao / 100);
    }

    public double calcularSalarioAnual(){
        return calcularSalarioComComissao() * 12;
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

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}