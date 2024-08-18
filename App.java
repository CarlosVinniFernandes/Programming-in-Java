// Escreva	uma	classe	para representar uma	Conta	Corrente que possui um número  
//um saldo, um status que informa se ela é especial ou não e um limite. 
//Desenvolva métodos para realizar saque (verificando se o	cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando 
//cheque especial  ou não. Desenvolva um programa principal que faça uso de todos os métodos da Classe.

public class App {
    public static void main(String[] args) {
        Corrente conta = new Corrente();

        conta.setNumero(24070061);
        System.out.println("Seu número é igual a: " + conta.getNumero());
        conta.setStatus(true);
        System.out.println("Você é cliente especial? "+conta.isStatus());

        

    }
}