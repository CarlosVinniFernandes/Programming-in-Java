public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time("Remo");

        t1.vincularTecnico("José", 5);
        Torcedor torc1 = new Torcedor("Carlos", 10, false);
        Torcedor torc2 = new Torcedor("Roberto", 10, true);
        Torcedor torc3 = new Torcedor("Monma", 10, false);
        Torcedor torc4 = new Torcedor("Renan", 10, false);
        Torcedor torc5 = new Torcedor("Yago", 10, false);

        t1.torcedores[0] =  torc1;
        t1.torcedores[1] =  torc2;
        t1.torcedores[2] =  torc3;
        t1.torcedores[3] =  torc4;
        t1.torcedores[4] =  torc5;

        t1.fichaLista();
        t1.atribuirPagamentos();
        t1.imprimirPagamentos();
        
    }
}
