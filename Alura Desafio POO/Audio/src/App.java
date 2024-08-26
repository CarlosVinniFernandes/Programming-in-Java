import modelos.Musica;
import modelos.Podcast;

public class App {
    public static void main(String[] args) throws Exception {
        
        Podcast p1 = new Podcast("Joe Rogan", 10, 200);
        System.out.println("O podcast tem: " + p1.duracao());
        
        Musica m1 = new Musica();
        m1.setNome("Someday");
        m1.setDuracao(4);

    }
}
