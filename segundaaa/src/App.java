import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSistema de Gerenciamento de Alunos");
            System.out.println("1. Adicionar novo aluno");
            System.out.println("2. Exibir todos os alunos");
            System.out.println("3. Buscar aluno por matrícula");
            System.out.println("4. Atualizar informações de um aluno");
            System.out.println("5. Excluir aluno");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    exibirAlunos();
                    break;
                case 3:
                    buscarAlunoPorMatricula();
                    break;
                case 4:
                    atualizarAluno();
                    break;
                case 5:
                    excluirAluno();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno novoAluno = new Aluno(nome, matricula, idade, curso);
        alunos.add(novoAluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private static void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    private static void buscarAlunoPorMatricula() {
        System.out.print("Digite a matrícula do aluno para busca: ");
        String matricula = scanner.nextLine();
    
        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoEncontrado = aluno;
                break;
            }
        }
    
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        } else {
            System.out.println("Aluno não encontrado com a matrícula: " + matricula);
        }
    }

    private static void atualizarAluno() {
        System.out.print("Digite a matrícula do aluno para atualizar: ");
        String matricula = scanner.nextLine();
    
        Aluno alunoParaAtualizar = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoParaAtualizar = aluno;
                break;
            }
        }
    
        if (alunoParaAtualizar != null) {
            System.out.print("Digite o novo nome (atualmente " + alunoParaAtualizar.getNome() + "): ");
            alunoParaAtualizar.setNome(scanner.nextLine());
            System.out.print("Digite a nova idade (atualmente " + alunoParaAtualizar.getIdade() + "): ");
            alunoParaAtualizar.setIdade(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Digite o novo curso (atualmente " + alunoParaAtualizar.getCurso() + "): ");
            alunoParaAtualizar.setCurso(scanner.nextLine());
            System.out.println("Informações do aluno atualizadas com sucesso!");
        } else {
            System.out.println("Aluno não encontrado com a matrícula: " + matricula);
        }
    }

    private static void excluirAluno() {
        System.out.print("Digite a matrícula do aluno para excluir: ");
        String matricula = scanner.nextLine();
    
        Aluno alunoParaExcluir = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoParaExcluir = aluno;
                break;
            }
        }
    
        if (alunoParaExcluir != null) {
            alunos.remove(alunoParaExcluir);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado com a matrícula: " + matricula);
        }
    }
    
}
