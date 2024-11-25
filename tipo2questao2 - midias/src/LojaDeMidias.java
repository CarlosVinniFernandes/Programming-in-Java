import java.util.ArrayList;

public class LojaDeMidias {
    private ArrayList<Midia> estoque = new ArrayList<>();
    private int estoqueBaixo = 5;

    public void adicionarMidia(Midia midia) {
        estoque.add(midia);
        System.out.println("Mídia adicionada ao estoque: " + midia.getTitulo());
    }

    public void retirarMidia(String titulo, int quantidade) {
        for (Midia midia : estoque) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                if (midia instanceof Estocavel) {
                    midia.retirarEstoque(quantidade);
                    verificarEstoqueBaixo(midia);
                }
                return;
            }
        }
        System.out.println("Não tem essa mídia no estoque!");
    }

    public void verificarEstoqueBaixo(Midia midia) {
        if (midia.getQuantidadeEmEstoque() < estoqueBaixo) {
            System.out.println("ALERTA: Estoque baixo para " + midia.getTitulo() + ". Quantidade atual: " + midia.getQuantidadeEmEstoque());
        }
    }

    public void listarEstoque() {
        System.out.println("Estoque de mídias:");
        System.out.println("---------------------------------------------");
        for (Midia midia : estoque) {
            System.out.println(midia.getTitulo() + " |" + midia.getTipo() + "| " + midia.getQuantidadeEmEstoque() + " unidades");
            System.out.println("---------------------------------------------");

        }
    }
}
