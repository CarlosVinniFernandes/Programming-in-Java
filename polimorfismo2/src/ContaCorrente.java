public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta) {
        super(numeroConta);
    }

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    public ContaCorrente() {
    }

    public void sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            valor = valor * 0.95;
            System.out.println("Você recebeu R$" + valor + " ficando com R$" + getSaldo());
        }
        else{
            System.out.println("Você tentou sacar R$" + valor + ", mas você possui apenas R$" + getSaldo());
        }
    }

    


}
