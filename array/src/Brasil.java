import java.util.ArrayList;

public class Brasil {
    private String nome;
    ArrayList<Brasileiro> brasileiros;

    public Brasil(String nome){
        this.nome = nome;
        brasileiros = new ArrayList<>();
    }

    public Brasil(){
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Brasileiro> getBrasileiros() {
        return brasileiros;
    }

    public void CriarBrasileiros(Brasileiro brasileiro){
        brasileiros.add(brasileiro);
    }

    public void listarBrasileiros(){
        for(Brasileiro brasileiro : brasileiros){
            System.out.println("O nome do brazilian é: " + brasileiro.getNome() + " E seu CPF é: " + brasileiro.getCpf());
        }
    }
}
