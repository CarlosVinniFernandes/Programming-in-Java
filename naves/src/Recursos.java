public class Recursos {
    private double peso;
    private String nomeDoRecurso;

    public Recursos(double peso, String nomeDoRecurso) {
        this.peso = peso;
        this.nomeDoRecurso = nomeDoRecurso;
    }

    public Recursos(){}
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNomeDoRecurso() {
        return nomeDoRecurso;
    }
    public void setNomeDoRecurso(String nomeDoRecurso) {
        this.nomeDoRecurso = nomeDoRecurso;
    }

    
}
