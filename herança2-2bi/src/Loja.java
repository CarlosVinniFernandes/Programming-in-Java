import java.util.ArrayList;

public class Loja {
    ArrayList<Produtos> produtos = new ArrayList<>();

    public void adicionarProdutos(Produtos produto){
        produtos.add(produto);
    }

    public void buscadorProdutos(Produtos produto){
        for(Produtos produto1 : produtos){
            if(produto1 == produto){
                System.out.println("O seu produto está na posicação: " + (produtos.indexOf(produto) + 1));
                produto.imprimirDetalhes();
                return;
            }
            else{
                continue;
            }
        }
        System.out.println("Seu produto não foi encontrado! :(");
    }



}
