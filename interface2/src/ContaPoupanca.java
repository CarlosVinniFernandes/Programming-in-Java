public class ContaPoupanca implements ContaBancaria {
    
    private String nomeCliente;
    private double saldo;

    public ContaPoupanca(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
    }

    public ContaPoupanca(String nomeCliente, double saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaPoupanca(){
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Você depositou R$" + valor + " e ficou com: R$" + getSaldo());
        }
        else{
            System.out.println("Não pode colocar número negativo!");
        }
    }

    @Override
    public void sacar(double valor) {
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Você sacou R$" + valor + " e ficou com: R$" + getSaldo());
        }
        else{
            System.out.println("Você não tem toda essa grana!");
        }
    }

    @Override
    public void obterSaldo() {
        System.out.println("Seu saldo atual é de: R$" + getSaldo());
    }
  
}
