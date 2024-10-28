import java.util.ArrayList;

public class FolhaDePagamento{

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionarios(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.getNome() + " tem o salário de: " + funcionario.getSalarioBase());
        }
    }

    
}
