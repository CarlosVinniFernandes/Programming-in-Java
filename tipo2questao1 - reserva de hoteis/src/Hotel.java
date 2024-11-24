import java.util.ArrayList;

public class Hotel {
    ArrayList<Quarto> quartos = new ArrayList<>();

    public void adicionarQuarto(Quarto quarto, String temporada){
                quartos.add(quarto);
                quarto.setTemporada(temporada);
                System.out.println("O quarto foi adicionado na temporada " + quarto.getTemporada() + "!" );

    }

    public void cancelarReserva(int numeroDoQuarto){
        for(Quarto quarto2 : quartos){
            if(quarto2.getNumeroDoQuarto() == numeroDoQuarto){
                System.out.println("O quarto " + quarto2.getNumeroDoQuarto() + " foi cancelado!");
                quarto2.cancelarReserva();
            }
        }
    }

    public void calcularReceita(){
        double receitaTotal = 0;
        for(Quarto quarto : quartos){
            if(quarto.isStatusDeOcupação() == true && quarto.getTemporada().toLowerCase() == "verao"){
                if(quarto instanceof QuartoIndividual){
                    receitaTotal += (1000 * 1.10);
                }
                else{
                    receitaTotal += (1500 * 1.10);
                }
            }
            else if(quarto.isStatusDeOcupação() == true && quarto.getTemporada().toLowerCase() == "inverno"){
                if(quarto instanceof QuartoIndividual){
                    receitaTotal += (500 * 1.20);
                }
                else{
                    receitaTotal += (1000 * 1.20);
                }
            }
            else if(quarto.isStatusDeOcupação() == true && quarto.getTemporada().toLowerCase() == "primavera")
            {
                if(quarto instanceof QuartoIndividual){
                    receitaTotal += (1500 * 1.30);
                }
                else{
                    receitaTotal += (2000 * 1.30);
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("Os quartos:");
        for(Quarto quarto : quartos){
            if(quarto.isStatusDeOcupação() == true){
                System.out.println(quarto.getNumeroDoQuarto());
            }
        }
        System.out.println("Geraram uma receita de " + receitaTotal);
    }





}
