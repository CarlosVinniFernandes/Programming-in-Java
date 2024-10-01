import java.util.ArrayList;

public class Escola {
    private String nome;
    ArrayList<Estudante> estudantes; // -> Nome que você dará para o ArrayList
    //       NomeDaClasse  
    
    public Escola(String nome) {
        this.nome = nome;
        estudantes = new ArrayList<>(); // - > nomeDoArrayList = new ArrayList<>();
    }

   
   public void adicionarElementos(Estudante estudante){ 
       estudantes.add(estudante);
   }

   public void listarElementos(){
       for(Estudante estudante : estudantes){
           System.out.println(estudante.getNome());
       }
   }

/* 
   public void listarElementos(){
    for(int i = 0; i < estudantes.size();i++){
        System.out.println(estudantes.get(i).getNome());
    }
}
*/
/*
    public void listarElementos(){
    for(NomeDaClasse valorGenerico(i) : nomeDoArray){
        System.out.println(valorGenerico.getNome());
    }
}
 */
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }
    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }





}


