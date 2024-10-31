public class Alimento extends Produto{
    
    public Alimento(String nome, double preco){
        super(nome, preco);
    }

    public void aplicarDesconto(){
        double preco = getPreco();
        preco = preco - (preco*5/100);
        setPreco(preco);
        System.out.println("Seu produto recebeu um desconto de 5% e ficou pelo preço de: " + getPreco());
    }
}
