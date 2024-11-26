public class AtividadeCardio extends Atividade implements Executavel {

    public AtividadeCardio(String nome, int duracaoMinutos, double nivelDeDificuldade){
        super(nome, duracaoMinutos, nivelDeDificuldade);
    }

    public AtividadeCardio() {
    }

    @Override
    public void iniciarAtividade(){
        System.out.println("Você está perdendo gordura! Antes você tinha " + getQuantidadeDeGordura());
        System.out.print(" e agora tem " + getQuantidadeDeGordura());
        System.out.println();
        setUsado(true);
    }

    @Override
    public void finalizarAtividade(){
        System.out.println("Você treinou " + getNome());
    }
}
