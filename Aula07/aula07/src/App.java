
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Carlo", "brazilian", 20, 1.71, 70, 20, 0, 0);
        
        l[1] = new Lutador("Lucca", "brazilian", 20, 1.75, 70.2, 20, 01, 0);
        
        l[0].apresentar();
        l[1].status();
    }

}
