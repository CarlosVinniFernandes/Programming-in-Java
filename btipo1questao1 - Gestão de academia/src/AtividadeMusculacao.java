public class AtividadeMusculacao extends Atividade implements Executavel {

    public AtividadeMusculacao(String nome, int duracaoMinutos, double nivelDeDificuldade){
        super(nome, duracaoMinutos, nivelDeDificuldade);
    }

    public AtividadeMusculacao() {
    }

    @Override
    public void iniciarAtividade(){
        System.out.println("Você está ganhando massa muscular! Antes você tinha " + getQuantidadeDeMusculo());
        System.out.print(" e agora tem " + getQuantidadeDeMusculo());
        System.out.println();
        setUsado(true);
    }

    @Override
    public void finalizarAtividade(){
        System.out.println("Você treinou " + getNome());
    }
}
