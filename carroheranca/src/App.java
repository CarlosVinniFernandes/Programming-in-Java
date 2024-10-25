public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v1 = new Veiculo("Fiat", 30000, 01);
        System.out.println(v1.getPreco());
        v1.aumentarIdade();
        v1.aumentarIdade();
        v1.aumentarIdade();
        System.out.println(v1.getPreco());
        v1.aplicarConserto();
        System.out.println(v1.getPreco());

        Moto m1 = new Moto("BMW", 20000, 2);
        System.out.println(m1.getPreco());
        m1.acelerar();

    }
}
