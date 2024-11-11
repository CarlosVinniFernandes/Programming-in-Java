public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }

    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    public ContaPoupanca() {
    }

    public void sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            valor = valor * 0.98;
            System.out.println("Você sacou R$" + valor + " ficando com R$" + getSaldo());
        }
        else{
            System.out.println("Você tentou sacar R$" + valor + ", mas você possui apenas R$" + getSaldo());
        }
    }
    
    
}
