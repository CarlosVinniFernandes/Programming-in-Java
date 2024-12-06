import java.util.ArrayList;

public class Naves {
    private String nomeDaNave;
    private String tipoDaNave;
    private int capacidadeDaNave;
    private int capacidadeDeRecursos;
    private ArrayList<Recursos> recursos = new ArrayList<>();
    private ArrayList<Tripulacao> pessoas = new ArrayList<>();
    private int pesoDeRecurso = 0;
    private int quantidadeDePessoas = 0;
    
    public Naves(String nomeDaNave, String tipoDaNave, int capacidadeDaNave, int capacidadeDeRecursos) {
        this.nomeDaNave = nomeDaNave;
        this.tipoDaNave = tipoDaNave;
        this.capacidadeDaNave = capacidadeDaNave;
        this.capacidadeDeRecursos = capacidadeDeRecursos;
    }

    public Naves(){}

    public String getNomeDaNave() {
        return nomeDaNave;
    }

    public void setNomeDaNave(String nomeDaNave) {
        this.nomeDaNave = nomeDaNave;
    }

    public String getTipoDaNave() {
        return tipoDaNave;
    }

    public void setTipoDaNave(String tipoDaNave) {
        this.tipoDaNave = tipoDaNave;
    }

    public int getCapacidadeDaNave() {
        return capacidadeDaNave;
    }

    public void setCapacidadeDaNave(int capacidadeDaNave) {
        this.capacidadeDaNave = capacidadeDaNave;
    }

    public int getCapacidadeDeRecursos() {
        return capacidadeDeRecursos;
    }

    public void setCapacidadeDeRecursos(int capacidadeDeRecursos) {
        this.capacidadeDeRecursos = capacidadeDeRecursos;
    }

    public ArrayList<Recursos> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Recursos> recursos) {
        this.recursos = recursos;
    }

    

    public ArrayList<Tripulacao> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Tripulacao> pessoas) {
        this.pessoas = pessoas;
    }

    public int getPesoDeRecurso() {
        return pesoDeRecurso;
    }

    public void setPesoDeRecurso(int pesoDeRecurso) {
        this.pesoDeRecurso = pesoDeRecurso;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public void adicionarTripulacao(String nome, String funcao, int nivelDeExperiencia, String especialidade){
        if (pessoas.size() < getCapacidadeDaNave()) {
            pessoas.add(new Tripulacao(nome, funcao, nivelDeExperiencia, especialidade));
            setQuantidadeDePessoas(getQuantidadeDePessoas() + 1);
        }
        else{
            System.out.println("Você atingiu a capacidade máxima!");
            return;
        }
    }

    public void adicionarTripulacao(Tripulacao t1){
        if (pessoas.size() + 1 <= getCapacidadeDaNave()) {
            pessoas.add(t1);
            setQuantidadeDePessoas(getQuantidadeDePessoas() + 1);
        }
        else{
            System.out.println("Você atingiu a capacidade máxima!");
            return;
        }
    }


    public void adicionarRecurso(int peso, String nomeDoRecurso){
        if (getPesoDeRecurso() + peso <= getCapacidadeDeRecursos() && peso <= getCapacidadeDeRecursos()) {
            recursos.add(new Recursos(peso, nomeDoRecurso));
            setPesoDeRecurso(getPesoDeRecurso() + peso);
        }
        else{
            int result = (getPesoDeRecurso() + peso) - getCapacidadeDeRecursos() ;
            System.out.println("Você atingiu a capacidade máxima de recursos! Você colocou " + result + " a mais do que deveria");
            return;
        }
        System.out.println(getPesoDeRecurso());
    }



    
}
