import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Eletronico e1 = new Eletronico("Celular", 2000);
        Eletronico e2 = new Eletronico("Tablet", 5000);
        Alimento a1 = new Alimento("Maça", 10);
        Alimento a2 = new Alimento("Carne", 50);

        e1.aplicarDesconto();
        e2.aplicarDesconto();
        a1.aplicarDesconto();
        a2.aplicarDesconto();

        e2.aplicarDesconto(50);
        a1.aplicarDesconto(90);

        ArrayList<Produto> iv = new ArrayList<>();

        iv.add(e1);
        iv.add(e2);
        iv.add(a1);
        iv.add(a2);

        System.out.println("----------------------------------");

        for (Produto produto : iv) {
            produto.aplicarDesconto();
        }


        
    }
}
