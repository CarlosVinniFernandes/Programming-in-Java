public class App {
    public static void main(String[] args) throws Exception {
        Eletronico el = new Eletronico("Cerolar", 2000);
        Eletronico el2 = new Eletronico("Tablet", 5000);
        Alimento a1 = new Alimento("Cenoura", 10);
        Alimento a2 = new Alimento("Maça", 5);

        el.aplicarDesconto();
        el2.aplicarDesconto();
        a1.aplicarDesconto();
        a2.aplicarDesconto();

        Inventario iv = new Inventario();

        iv.addProdutos(el);
        iv.addProdutos(el2);
        iv.addProdutos(a1);
        iv.addProdutos(a2);
        System.out.println("---------------------------------");

        iv.aplicarDesconto();

    }
}
