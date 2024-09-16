/*Crie um projeto chamado ProjetoHerois e crie a classe Heroi
dentro do pacote padrão (que já vem no projeto). Em seguida,
declare três atributos na classe Heroi e crie um método
também. Depois, programe o construtor não parametrizado e
outro parametrizado (usando todos os atributos). */
public class App {
    public static void main(String[] args) throws Exception {
        Heroi h1 = new Heroi();
        Heroi h2 = new Heroi("Superman", 100, "Superforça");

        System.err.println(h2.toString());
        h2.vencerLuta();
        System.err.println(h2.toString());

        //h1.nome = "Batman";
        //h1.lutasVencidas = 300;
        //h1.poder = "Dinheiro";

        h1.setNome("Batman");
        h1.setLutasVencidas(-300);
        h1.setPoder("Dinheiro");


        System.err.println(h1.toString());
    }
}
