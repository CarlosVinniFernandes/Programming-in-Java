public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc1 = new ContaCorrente(2020);
        ContaPoupanca cp1 = new ContaPoupanca(2121, 5000);

        cc1.depositar(3000);
        cc1.sacar(100);

        Banco b1 = new Banco();

        b1.addContas(cp1);
        b1.addContas(cc1);

        b1.saques(100);
    }
}
