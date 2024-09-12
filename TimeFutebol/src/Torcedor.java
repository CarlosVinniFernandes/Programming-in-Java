public class Torcedor {
    String nome;
    int jogosAssistidos;
    boolean socio;
    boolean[] pagamentos = new boolean[4];

    public Torcedor(String nome, int jogosAssistidos, boolean socio){
        this.nome = nome;
        this.jogosAssistidos = jogosAssistidos;
        this.socio = socio;
    }
}
