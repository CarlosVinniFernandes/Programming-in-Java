public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ControleRemoto c1 = new ControleRemoto(50, true, true);

        c1.abrirMenu();
        c1.maisVolume();
        c1.maisVolume();
        c1.abrirMenu();
    }
}
