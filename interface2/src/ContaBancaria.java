public interface ContaBancaria {
    abstract void depositar(double valor);
    abstract void sacar(double valor);
    abstract void obterSaldo();

}
