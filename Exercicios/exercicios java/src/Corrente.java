// Escreva	uma	classe	para representar uma	Conta	Corrente que possui um número  
//um saldo, um status que informa se ela é especial ou não e um limite. 
//Desenvolva métodos para realizar saque (verificando se o	cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando 
//cheque especial  ou não. Desenvolva um programa principal que faça uso de todos os métodos da Classe.

// get - pegar o valor ----- set -> insere valor na variavel
public class Corrente {
    int numero;
    double saldo = 0.0;
    boolean status;
    double limite;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        if(saldo >= getSaldo()){
        return saldo;
        }
        else{
            System.out.println("Você ta liso!Tem só "+ getSaldo());
        }
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

}
