public class Alimento extends Produto{

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    public Alimento() {
    }

    public void aplicarDesconto(){
        double preco = getPreco();
        preco = preco - (preco * 0.05);
        setPreco(preco);
        System.out.println("Seu produto ganhou um desconto de 5%! Agora ele vale: " + getPreco());
    }

    public void aplicarDesconto(double taxaExtra){
        double preco = getPreco();
        preco = preco * (1.00 - taxaExtra/100);
        setPreco(preco);
        System.out.println("Seu produto ganhou um desconto de " + taxaExtra + "%! Agora ele vale: " + getPreco());
    }
    
}
