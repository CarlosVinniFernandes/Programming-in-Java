public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente c1 = new ContaCorrente("Isaac");
        c1.depositar(100);
        c1.depositar(1000);
        c1.depositar(10000);
        c1.sacar(12000);

        ContaPoupanca c2 = new ContaPoupanca("Casseb", 30000);
        c2.depositar(10000);
    }
}
