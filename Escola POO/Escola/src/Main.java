import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor professor = new Professor("Dr. João", "Computação", "joao@universidade.edu");
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", "10:00", "Sala 101", professor);

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            String matriculaAluno = scanner.nextLine();
            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + nomeAluno + ": ");
                double nota = scanner.nextDouble();
                aluno.adicionarNota(nota);
            }
            scanner.nextLine(); 
        }

        System.out.println(al);
        scanner.close();
    }
}
