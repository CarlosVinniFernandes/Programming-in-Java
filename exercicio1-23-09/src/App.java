public class App {
    public static void main(String[] args) throws Exception {
        Continente c1 = new Continente("Américas");

        c1.criarPaises(new Pais("Brasil", 8000, 210));
        c1.criarPaises(new Pais("Canadá", 9985, 40));
        c1.criarPaises(new Pais("EUA", 9834, 333));
        
        c1.listarPais();
        c1.dimensaoTotal();
        c1.maiorPop();
        c1.menorPop();
        c1.maiorDensidade();
        c1.menorDensidade();


    }
}
