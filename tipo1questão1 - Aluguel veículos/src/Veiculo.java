public class Veiculo {
    private String modelo;
    private int anoDeFabricacao;
    private boolean statusDeDisponibilidade;
    
    public Veiculo(String modelo, int anoDeFabricacao, boolean statusDeDisponibilidade) {
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.statusDeDisponibilidade = statusDeDisponibilidade;
    }

    public Veiculo(){
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public boolean isStatusDeDisponibilidade() {
        return statusDeDisponibilidade;
    }
    public void setStatusDeDisponibilidade(boolean statusDeDisponibilidade) {
        this.statusDeDisponibilidade = statusDeDisponibilidade;
    }

    
    
}
