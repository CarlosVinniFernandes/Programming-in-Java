public class Filme extends Midia implements Estocavel {

    public Filme(String titulo, int quantidadeEmEstoque) {
        super(titulo, "Filme", quantidadeEmEstoque);
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        setQuantidadeEmEstoque(getQuantidadeEmEstoque() + quantidade);
        System.out.println("Estoque de filmes atualizado");
        System.out.println("quantidade atual: " + getQuantidadeEmEstoque());
    }

    @Override
    public void retirarEstoque(int quantidade) {
        if (getQuantidadeEmEstoque() >= quantidade) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
            System.out.println("Estoque de filmes reduzido");
            System.out.println("quantidade atual: " + getQuantidadeEmEstoque());
        } else {
            System.out.println("Quantidade insuficiente em estoque para " + getTitulo());
        }
    }
}
