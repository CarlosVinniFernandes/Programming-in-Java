public class App {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola Argo", "Alessandra Natasha");
        
        escola.adicionarProfessor(new Professor("Casseb", 3000));
        escola.adicionarProfessor(new Professor("Girotto", 4000));
        escola.adicionarProfessor(new Professor("Polyana", 5000));
        
        System.out.println("Média Salarial: " + escola.calcularMediaSalario());
        
        escola.exibirProfessoresComSalarioAcimaDaMedia();
    }
}