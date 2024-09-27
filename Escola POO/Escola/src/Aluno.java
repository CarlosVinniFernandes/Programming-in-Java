import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public boolean foiAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}
