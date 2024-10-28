public class App {
    public static void main(String[] args) throws Exception {
        Gerente g1 = new Gerente("Carlos", 2000, 100);
        g1.calcularSalario();


        Funcionario e1 = new Estagiario("Dani", 30);
        Funcionario e2 = new Estagiario("Isaac", 300);
        Funcionario e3 = new Estagiario("Yago", 10);
        e1.calcularSalario();   
        
        FolhaDePagamento f1 = new FolhaDePagamento();
        f1.adicionarFuncionarios(e1);
        f1.adicionarFuncionarios(g1);
        f1.adicionarFuncionarios(e2);
        f1.adicionarFuncionarios(e3);
        f1.listarFuncionarios();
        
    }
}
