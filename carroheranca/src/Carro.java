public class Carro extends Veiculo {
    
    public Carro(String nome, double preco, int idade) {
        super(nome, preco, idade);
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
