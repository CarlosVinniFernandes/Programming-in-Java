class Carro extends Veiculo {
    public Carro(String marca, String modelo, double valor) {
        super(marca, modelo, valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.05;
    }
}