import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private ArrayList<Pratos> pratos;
    private String gerente;
    
    public Restaurante(String nome, String gerente) {
        this.nome = nome;
        this.gerente = gerente;
        pratos = new ArrayList<>();
    }

    public Restaurante(){
    }

    public void adicionarPrato(Pratos prato){
        pratos.add(prato);
    }

    public void exibirMenu(){
        System.out.println("-----------Menu-----------");
        for(Pratos prato : pratos){
            System.out.println("Nome: " + prato.getNome() + "\nPreço: " + prato.getPreco() + "\n----------------");
        }
    }

    public double calcularLucro(double porcentagem){
        double totalPreco = 0;
        for(Pratos prato : pratos){
            totalPreco += prato.getPreco();
        }
        return totalPreco * porcentagem / 100;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Pratos> getPratos() {
        return pratos;
    }
    public void setPratos(ArrayList<Pratos> pratos) {
        this.pratos = pratos;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
}
