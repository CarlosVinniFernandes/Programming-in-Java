import java.util.Scanner;

public class Biblioteca {
    Bibliotecario b1 = new Bibliotecario();
    Livro[] livro = new Livro[5];
    Scanner sc = new Scanner(System.in);

    public void Bibliotecario(String nome, String cargo, String contato){
        b1.nome = nome;
        b1.cargo = cargo;
        b1.contato = contato;
        System.out.println("O Bibliotecário é o " + b1.nome + " |Seu cargo é: " + b1.cargo + " |e seu contato: " + b1.contato);
    }

    void vincularLivros(){
        for(int i = 0; i < 5; i++){
        System.out.println("Qual o nome do autor do livro " + livro[i].titulo+ " ?");
        livro[i].autor = sc.nextLine();
        System.out.println("Qual o nome da categoria do livro " + livro[i].titulo+ " ?");
        livro[i].categoria = sc.nextLine();
        System.out.println("Qual o numero de paginas? " + livro[i].titulo+ " ?");
        livro[i].numeroPaginas = sc.nextInt();
        sc.nextLine();

        }
    }
    
    void imprimirFicha(){
        System.out.println("Os livros são:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < 5; i++){
            if(livro[i] == null){
                continue;
            }
            else{
                System.out.println("|Nome: " + livro[i].titulo + " |Autor: " + livro[i].autor + " |Quantidade de páginas: " + livro[i].numeroPaginas + " Gênero: " + livro[i].categoria);
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }

}
