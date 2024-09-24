public class Pais {
    private String nome;
    private double areaDoPais;
    private double populacao;
    
    public Pais(String nome, double areaDoPais, double populacao) {
        this.nome = nome;
        this.areaDoPais = areaDoPais;
        this.populacao = populacao;
    }

    public Pais(){
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAreaDoPais() {
        return areaDoPais;
    }
    public void setAreaDoPais(double areaDoPais) {
        this.areaDoPais = areaDoPais;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Pais nome=[" + nome + "], areaDoPais=[" + areaDoPais + "], populacao=[" + populacao + "]";
    }

    
}
