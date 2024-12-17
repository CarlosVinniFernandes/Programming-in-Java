abstract class Veiculo {
    private String marca;
    private String modelo;
    private double valor;

    public Veiculo(String marca, String modelo, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValor() {
        return valor;
    }

    abstract double calcularImposto();
}