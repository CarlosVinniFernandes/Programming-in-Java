import java.util.ArrayList;
import java.util.Scanner;

class Disciplina {
    private String nome;
    private String horario;
    private String sala;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, String horario, String sala, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.sala = sala;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarResultados() {
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            String status = aluno.foiAprovado() ? "Aprovado" : "Reprovado";
            System.out.println("Aluno: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            System.out.println("Notas: " + aluno.getNotas());
            System.out.printf("Média: %.2f - Status: %s\n\n", media, status);
        }
    }
}