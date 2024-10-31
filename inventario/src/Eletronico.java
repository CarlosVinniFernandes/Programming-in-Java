public class Eletronico extends Produto{

    public Eletronico(String nome, double preco){
        super(nome, preco);
    }

    public void aplicarDesconto(){
        double preco = getPreco();
        preco = preco - (preco*10/100);
        setPreco(preco);
        System.out.println("Seu produto recebeu um desconto de 10% e ficou pelo preço de: " + getPreco());
    }

    
}
