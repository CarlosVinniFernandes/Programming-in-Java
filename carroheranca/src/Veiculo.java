public class Veiculo{
    private String nome;
    protected double preco;
    private int idade;
    double precoOriginal = 0;

    public Veiculo(String nome, double preco, int idade) {
        this.nome = nome;
        this.preco = preco - idade * 1000;
        this.idade = idade;
        precoOriginal = preco;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void aumentarIdade(){
        setIdade(getIdade() + 1);
        setPreco(getPreco() - 1000);
        System.out.println("Seu veiculo tem " + getIdade() + " anos!");
        if(getPreco() <= 0){
            System.out.println("Seu veiculo quebrou de velhice ;(");
            setPreco(0);
        }
    }

    public void aplicarConserto(){
        if(getPreco() >= precoOriginal){
            System.out.println("Seu veiculo está em perfeitas condições!");
        }
        else{
            setPreco(getPreco() + 500);
            System.out.println("Seu veiculo foi consertado!");
        }
    }

    public void acelerar(){
        System.out.println("O veiculo está acelerando com 100 km/h");
    }
    




}


