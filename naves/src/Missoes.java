import java.util.ArrayList;
import java.util.List;

public class Missoes {
    private String nome;
    private String objetivo;
    private String dataDeLancamento;
    private String destino;
    private List<Naves> naves = new ArrayList<>();
    private boolean statusNave;
    private boolean statusRecurso;
    private boolean statusTripulacao;
    
    public Missoes(String nome, String objetivo, String dataDeLancamento, String destino) {
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataDeLancamento = dataDeLancamento;
        this.destino = destino;

    }

    public Missoes() {
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getObjetivo() {
        return objetivo;
    }



    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }



    public String getDataDeLancamento() {
        return dataDeLancamento;
    }



    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }



    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isStatusNave() {
        return statusNave;
    }

    public void setStatusNave(boolean statusNave) {
        this.statusNave = statusNave;
    }

    public boolean isStatusRecurso() {
        return statusRecurso;
    }

    public void setStatusRecurso(boolean statusRecurso) {
        this.statusRecurso = statusRecurso;
    }

    public boolean isStatusTripulacao() {
        return statusTripulacao;
    }

    public void setStatusTripulacao(boolean statusTripulacao) {
        this.statusTripulacao = statusTripulacao;
    }

    public void adicionarNave(String nomeDaNave, String tipoDaNave, int capacidadeDaNave, int capacidadeDeRecursos){
        naves.add(new Naves(nomeDaNave, tipoDaNave, capacidadeDaNave, capacidadeDeRecursos));
        setStatusNave(true);
    }

    public void adicionarNave(Naves nave){
        naves.add(nave);
        setStatusNave(true);
    }

    public Naves escolherNave(String nomeDaNave){
        for (Naves nave : naves) {
            if(nave.getNomeDaNave().equalsIgnoreCase(nomeDaNave)){
                return nave;
            }
        }
        return null;
    }

    public void missaoRelatorio(){
        System.out.println("-------------------------");
        System.out.println("Nome da Missão: " +  getNome());
        System.out.println("Data de lançamento: " +  getDataDeLancamento());
        System.out.println("Destino: " +  getDestino());
        System.out.println("Objetivo: " +  getObjetivo());
        System.out.println("-------------------------");
        if (naves.isEmpty()) {
            System.out.println("Essa missão ainda não tem naves!");
        }
        else{
            for(Naves nave : naves){
                System.out.println("Nome da nave: " + nave.getNomeDaNave());
                System.out.println("Tipo da nave: " + nave.getTipoDaNave());
                System.out.println("Capacidade de armazenamento de recursos da nave: " + nave.getCapacidadeDeRecursos());
                System.out.println("Capacidade de tripulação máxima da nave: " + nave.getCapacidadeDaNave());
                System.out.println("Levando " + nave.getPesoDeRecurso() + "kg de recursos!");
                System.out.println("Quantidade de pessoas: " + nave.getQuantidadeDePessoas());
            }
        }
    }

 

    

}
