public class Planta{

    private String nome;
    private double altura;


    public Planta(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public Planta(){

    }
    

    public void crescer(){
        this.altura += 1;
        System.out.println("A planta cresceu e está com: "+altura);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    




}