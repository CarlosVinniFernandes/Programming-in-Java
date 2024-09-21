public class Brasileiro {
    private String nome;
    private int cpf;

    public Brasileiro(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Brasileiro(){

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}
