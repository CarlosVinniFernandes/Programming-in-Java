public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Sabão", 5, 00);

       System.out.println(p1.calcularValorEstoque());
       p1.reporEstoqueRecursivo(30);
       System.out.println(p1.getQtdEstoque());
       System.out.println(p1.calcularValorEstoque());
       System.out.println(p1.calcularDescontoTotal(10));
    }
}
