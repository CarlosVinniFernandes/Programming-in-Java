public class Carro implements Veiculo {
    private String nome;
    private int velocidade = 0;
    private final int velocidadeMaxima = 180;

    public Carro(String nome) {
        this.nome = nome;
    }
    public Carro() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public void acelerar() {
        if((getVelocidade() + 10) <= velocidadeMaxima){
            setVelocidade(getVelocidade() + 10);
            System.out.println(getNome() + " acelerou incriveis 10km/h chegando a " + getVelocidade() + " km/h");
        }
        else{
            System.out.println("Calma lá paizão, sua velocidade ja está no máximo de " + getVelocidadeMaxima() + " km/h");
        }
    }

    @Override
    public void frear() {
        if(getVelocidade() >= 10){
            setVelocidade(getVelocidade() - 10);
            System.out.println(getNome() + " freou incriveis 10km/h chegando a " + getVelocidade() + " km/h");
        }
        else{
            System.out.println("Você está parado!");
        }
    }

    @Override
    public void obterVelocidadeMaxima() {
        System.out.println("Sua velocidade máxima é: " + getVelocidadeMaxima());
    }
    
}
