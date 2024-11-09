import java.util.ArrayList;

public class Biblioteca {
    ArrayList<ItemBiblioteca> itens = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public void listarItens(){
        for(ItemBiblioteca item : itens){
            System.out.println(item.exibirDetalhes());
            System.out.println("----------------------");
        }
    }

    public void buscarItensPorTipo(String tipo) {
        System.out.println("\n\nBusca pelo tipo: " + tipo);
        boolean encontrado = false;
    
        for (ItemBiblioteca item : itens) {
            if (item.getTipoItem().equals(tipo)) {
                System.out.println(item.exibirDetalhes());
                System.out.println("----------------------");
                encontrado = true; 
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum item encontrado do tipo: " + tipo);
        }
    }

    int contador = 0;
    int i = 0;

    public void contarItensPorTipo(String tipo){
        if (i >= itens.size()) {
            System.out.println("Quantidade de itens do tipo " + tipo + ": " + contador);
            return;
        }
        
        if(itens.get(i).getTipoItem().equals(tipo)){
            contador++;
        }
        i++;
        contarItensPorTipo(tipo);
    }



}
