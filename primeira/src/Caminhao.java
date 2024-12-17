class Caminhao extends Veiculo {
    public Caminhao(String marca, String modelo, double valor) {
        super(marca, modelo, valor);
    }

    @Override
    public double calcularImposto() {
        return 1000;
    }
}