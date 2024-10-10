public class App {
    public static void main(String[] args) throws Exception {
        Vendedor v1 = new Vendedor("Isaac", 4000, 05);

        System.out.println(v1.calcularSalarioComComissao());
        System.out.println(v1.getComissao());
        v1.venderProduto(100);
        System.out.println(v1.calcularSalarioComComissao());
        System.out.println(v1.getComissao());
        System.out.println(v1.calcularSalarioComComissao());
    }
}
