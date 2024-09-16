public class Heroi {
    private String nome;
    private int lutasVencidas;
    private String poder;

    public Heroi(String nome, int lutasVencidas, String poder) {
        this.nome = nome;
        this.lutasVencidas = lutasVencidas;
        this.poder = poder;
    }

    public Heroi() {
    }

    public void vencerLuta() {
        lutasVencidas = this.lutasVencidas + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != ""){
            this.nome = nome;
        }
        else{
            System.err.println("Digite algo válido");
        }
    }

    public int getLutasVencidas() {
        return lutasVencidas;
    }

    public void setLutasVencidas(int lutasVencidas) {
        if(lutasVencidas >= 0){
            this.lutasVencidas = lutasVencidas;
        }
        System.err.println("Digite um numero maior ou igual a 0");
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Nome[" + nome + "], lutasVencidas=[" + lutasVencidas + "], poder=[" + poder + "]";
    }
}
