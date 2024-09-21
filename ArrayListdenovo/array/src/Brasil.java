import java.util.ArrayList;

public class Brasil {
    private String estado;
    ArrayList<Brasileiro> brasileiros;

    public Brasil(String estado){
        this.estado = estado;
        brasileiros = new ArrayList<>();
    }

    public void criarBrasileiros(Brasileiro brasileiro){
        brasileiros.add(brasileiro);
    }

    public void mostrarBrasileiros(){
        for(Brasileiro brasileiro : brasileiros){
            System.out.println("Nome: " + brasileiro.getNome()  + "CPF: " + brasileiro.getCpf());
        }
    }

}
