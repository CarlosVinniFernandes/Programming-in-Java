public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("BMW");

        c1.frear();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        c1.obterVelocidadeMaxima();

        System.out.println("-------------");
        Moto m1 = new Moto("Honda");
        m1.acelerar();
        m1.acelerar();
        m1.acelerar();
        m1.frear();
        m1.obterVelocidadeMaxima();
        System.out.println("-------------");

        Bicicleta b1 = new Bicicleta("Bike");
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.frear();
        b1.obterVelocidadeMaxima();

    }
}
