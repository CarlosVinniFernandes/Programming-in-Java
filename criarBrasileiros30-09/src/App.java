public class App {
    public static void main(String[] args) throws Exception {
        Escola ideal = new Escola("Ideal");
    //  NomedaClasse nomeObjeto = new NomedaClasse(Costrutor);

        ideal.adicionarElementos(new Estudante("Miguel", 24070061));
    //  nomedoObjeto.adicionarElementos(new nomedaClasse(Construtor));
        
        ideal.listarElementos();
    }
}
