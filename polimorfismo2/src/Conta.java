public class Conta {
    private int numeroConta;
    private double saldo;
    
    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta(){
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Sua conta recebeu: R$" + valor + "! Agora o seu saldo é igual a: " + getSaldo());
    }

    public void sacar(){
    }

    public void sacar(double valor){
    }


    
}
