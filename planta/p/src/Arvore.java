public class Arvore extends Planta {


    public Arvore(String nome, double altura) {
        super(nome, altura);
    }

    @Override
    public void crescer(){
        this.setAltura(getAltura()+2);
        System.out.println("A arvore de nome: "+getNome()+" está com: "+getAltura()+" metros de altura");
    }

    
    
}
