public class Musica extends Midia implements Estocavel {

    public Musica(String titulo, int quantidadeEmEstoque) {
        super(titulo, "Música", quantidadeEmEstoque);
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        setQuantidadeEmEstoque(getQuantidadeEmEstoque() + quantidade);
        System.out.println("Adicionado ao estoque!"); 
        System.out.println("quantidade atual: " + getQuantidadeEmEstoque());
    }

    @Override
    public void retirarEstoque(int quantidade) {
        if (getQuantidadeEmEstoque() >= quantidade) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
            System.out.println("Estoque de músicas reduzido");
            System.out.println("quantidade atual: " + getQuantidadeEmEstoque());
        } else {
            System.out.println("Quantidade insuficiente em estoque para " + getTitulo());
        }
    }
}
