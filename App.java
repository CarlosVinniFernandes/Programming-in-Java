public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Caneta c1 = new Caneta("NIC", "Amarela", 0.7f);
        
        Caneta c2 = new Caneta("Vic", "Rosa", 0.5f);

        c2.status();
    }
}
