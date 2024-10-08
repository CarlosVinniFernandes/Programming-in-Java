public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
   
    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public Produto(){
    }

    public double calcularValorEstoque(){
        return getQtdEstoque() * getPreco();
    }

    public void reporEstoqueRecursivo(int num){
        if(getQtdEstoque() >= num){
            return;
        }
        else{
            setQtdEstoque(getQtdEstoque() + 1);
            reporEstoqueRecursivo(num);
        }
    }

    public double calcularDescontoTotal(double desconto){
        return calcularValorEstoque() * desconto/100;
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

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    
    
}
