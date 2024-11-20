public class Flor extends Planta {
    
    public Flor(String nome, double altura) {
        super(nome, altura);
    }

    public void crescer(){
        this.setAltura(getAltura()+0.1);
        System.out.println("A flor de nome: "+getNome()+" está com: "+getAltura()+" de altura");
    }

    public void crescer(boolean entrada){
        this.setAltura(getAltura()+0.5);
        System.out.println("A flor de nome: "+getNome()+" está com: "+getAltura()+" de altura");
    }

}
