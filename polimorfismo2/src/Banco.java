import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> banco = new ArrayList<>();

    public void addContas(Conta conta){
        banco.add(conta);
    }

    public void saques(double valor){
        for(Conta conta : banco){
            conta.sacar(valor);
        }
    }







}
