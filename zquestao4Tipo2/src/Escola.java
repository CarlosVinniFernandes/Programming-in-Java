import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Professor> professores;
    private String diretor;

    public Escola(String nome, String diretor) {
        this.nome = nome;
        this.diretor = diretor;
        this.professores = new ArrayList<>();
    }

    public Escola() {
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public double calcularMediaSalario() {
        if (professores.isEmpty()) {
            return 0;
        }
        double mediaSalarios = 0;
        for (Professor professor : professores) {
            mediaSalarios += professor.getSalario();
        }
        return mediaSalarios / professores.size();
    }

    public void exibirProfessoresComSalarioAcimaDaMedia() {
        double mediaSalario = calcularMediaSalario();
        System.out.println("Professores com salário acima da média:");
        for (Professor professor : professores) {
            if (professor.getSalario() > mediaSalario) {
                System.out.println(professor.getNome() + " tem o salário de: " + professor.getSalario());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}