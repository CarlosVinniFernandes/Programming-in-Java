public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroDaConta;
    
    public ContaBancaria(String titular, double saldo, int numeroDaConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public ContaBancaria() {
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacarRecursivo(double valor) {
        if (valor <= 0 || saldo <= 0) {
            return;
        }
        if (saldo < valor) {
            valor = saldo;
        }
        setSaldo(getSaldo() - 10);
        System.out.println("Saldo atual: " + getSaldo());
        sacarRecursivo(valor - 10);
    }

    public void transferencia(ContaBancaria c2, double valor) {
        if (valor > 0 && saldo >= valor) {
            setSaldo(getSaldo() - valor);
            c2.setSaldo(c2.getSaldo() + valor);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}