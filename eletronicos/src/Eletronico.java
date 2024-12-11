public class Eletronico extends Produto{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public Eletronico() {
    }
    
    public void aplicarDesconto(){
        double preco = getPreco();
        preco = preco * 0.90;
        setPreco(preco);
        System.out.println("Seu produto ganhou um desconto de 10%! Agora ele vale: " + getPreco());
    }

    public void aplicarDesconto(double taxaExtra){
        double preco = getPreco();
        preco = preco * (1.00 - taxaExtra/100);
        setPreco(preco);
        System.out.println("Seu produto ganhou um desconto de " + taxaExtra + "%! Agora ele vale: " + getPreco());
    }
    
}
