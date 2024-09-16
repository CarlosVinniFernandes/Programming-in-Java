import java.util.ArrayList;

public class Brasil {
    private ArrayList<Brasileiro> brasileiros;

    public Brasil(){
        brasileiros = new ArrayList<>();
    }

    public void adicionarBrasileiros(Brasileiro brasileiro){
        brasileiros.add(brasileiro);
    }

    public void listarBrasileiros(){
        for(Brasileiro brasileiro : brasileiros){
            System.out.println(brasileiro.getNome());
        }
    }



}
