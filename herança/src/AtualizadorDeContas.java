class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    AtualizadorDeContas(double selic) {
    this.selic = selic;
    }
    
    public void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo atualizado: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    public double getSelic() {
        return selic;
    }
    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    



    }