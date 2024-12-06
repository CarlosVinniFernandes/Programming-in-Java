public class Tripulacao {
    private String nome;
    private String funcao;
    private int nivelDeExperiencia;
    private String especialidade;
    
    public Tripulacao(String nome, String funcao, int nivelDeExperiencia, String especialidade) {
        this.nome = nome;
        this.funcao = funcao;
        this.nivelDeExperiencia = nivelDeExperiencia;
        this.especialidade = especialidade;
    }

    public Tripulacao(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    public void setNivelDeExperiencia(int nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    

    
}
