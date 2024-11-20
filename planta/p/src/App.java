import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Planta p1 = new Planta("grama", 0.1);
        //p1.crescer();

        Arvore a1 = new Arvore("Mangueira", 10);
       // a1.crescer();

        Flor f1 = new Flor("Girassol", 1);
        //f1.crescer(true);

        ArrayList<Planta> jardim = new ArrayList<>();

        jardim.add(p1);
        jardim.add(a1);
        jardim.add(f1);

        for (Planta planta : jardim) {
            if(planta instanceof Arvore || planta instanceof Flor){
                planta.crescer();
            }
        }




    }
}
