public class App {
    public static void main(String[] args) {
        Animal vaca = new Animal("Rex", 5, "Vaca");
        Animal galinha = new Animal("Mimi", 3, "Galinha");
        Animal cachorro = new Animal("Scooby", 3, "cachorro");

        vaca.emitirSom("Moo"); 
        galinha.emitirSom("Cocoricó");
        cachorro.emitirSom("teste"); 


    }
}