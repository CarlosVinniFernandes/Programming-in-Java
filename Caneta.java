public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampado;

    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        //this.cor = "Azul";
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampado = true;
    }

    public void destampar(){
        this.tampado = false;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampado: " + this.tampado);
    }
}
