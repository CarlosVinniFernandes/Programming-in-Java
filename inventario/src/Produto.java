public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto){
        preco = preco - (preco*desconto/100);
        setPreco(preco);
        System.out.println("Seu produto recebeu um desconto de " + desconto + " e ficou pelo preço de: " + getPreco());
    }
    

    
}
