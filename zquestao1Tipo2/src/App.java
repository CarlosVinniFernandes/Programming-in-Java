public class App {
    public static void main(String[] args) throws Exception {
       ContaBancaria c1 = new ContaBancaria("Isaac Elgrably", 2732.5, 70);
       c1.depositar(100);
       System.out.println(c1.getSaldo());
        //c1.sacarRecursivo();
        System.out.println(c1.getSaldo());

        ContaBancaria c2 = new ContaBancaria("Girotto", 1000, 70);
        c1.transferencia(c2, 300);
        c1.transferencia(c2, 500);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());


    }
}
