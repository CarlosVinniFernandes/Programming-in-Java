public class ContaCorrente extends Conta{
    
    void atualiza(double taxa){
        super.atualiza(taxa * 2);
    }

    void deposita(double valor) {
        this.saldo += valor - 0.10;
        }

}
