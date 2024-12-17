class Moto extends Veiculo {
    public Moto(String marca, String modelo, double valor) {
        super(marca, modelo, valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.03;
    }
}