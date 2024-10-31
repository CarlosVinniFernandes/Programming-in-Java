import java.util.ArrayList;

public class Inventario {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }

    public void aplicarDesconto() {
        for (Produto produto : produtos) {
            if (produto instanceof Eletronico) {
                produto.aplicarDesconto(10);
            } else {
                produto.aplicarDesconto(5);
            }
        }
    }
}
