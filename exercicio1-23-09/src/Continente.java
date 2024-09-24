import java.util.ArrayList;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    public Continente(String nome){
        this.nome = nome;
        paises = new ArrayList<>();
    }

    public Continente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public void criarPaises(Pais pais){
        paises.add(pais);
    }

    public void listarPais(){
        for(Pais pais : paises){
            System.out.println(pais.toString());
        }
    }

    double dimensaoTotal = 0.0;
    public void dimensaoTotal(){
        for(Pais pais : paises){
            dimensaoTotal += pais.getAreaDoPais();
        }
        System.out.println("A dimensão total é: " + dimensaoTotal);
    }


    public void maiorPop(){
        double maiorPop = paises.get(0).getPopulacao();
        String paisMaior = paises.get(0).getNome();
        for(int i = 1; i < paises.size();i++){
            if(paises.get(i).getPopulacao() > maiorPop){
                maiorPop = paises.get(i).getPopulacao();
                paisMaior = paises.get(i).getNome();
            }
        }
        System.out.println("O pais com a maior população é: "+ paisMaior+ " com: " + maiorPop + " habitantes");
    }

    public void menorPop(){
        double menorPop = paises.get(0).getPopulacao();
        String paisMenor = paises.get(0).getNome();
        for(int i = 1; i < paises.size();i++){
            if(paises.get(i).getPopulacao() < menorPop){
                menorPop = paises.get(i).getPopulacao();
                paisMenor = paises.get(i).getNome();
            }
        }
        System.out.println("O pais com a menor população é: "+ paisMenor+ " com: " + menorPop + " habitantes");
    }

    public void maiorDensidade(){
        double maiorDensidade = paises.get(0).getAreaDoPais();
        String paisMaiorDensidade = paises.get(0).getNome();
        for(int i = 1; i < paises.size();i++){
            if(paises.get(i).getAreaDoPais() > maiorDensidade){
                maiorDensidade = paises.get(i).getAreaDoPais();
                paisMaiorDensidade = paises.get(i).getNome();
            }
        }
        System.out.println("O pais com a maior densidade é: "+ paisMaiorDensidade+ " com: " + maiorDensidade + " KM2");
    }

    public void menorDensidade(){
        double menorDensidade = paises.get(0).getAreaDoPais();
        String paisMenorDensidade = paises.get(0).getNome();
        for(int i = 1; i < paises.size();i++){
            if(paises.get(i).getAreaDoPais() < menorDensidade){
                menorDensidade = paises.get(i).getAreaDoPais();
                paisMenorDensidade = paises.get(i).getNome();
            }
        }
        System.out.println("O pais com a menor densidade é: "+ paisMenorDensidade+ " com: " + menorDensidade + " KM2");
    }
f
    
}

