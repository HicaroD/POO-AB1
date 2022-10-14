package questao6;

class ContaCorrente {
    protected double saldo;

    ContaCorrente() {
        saldo = 0;
    }

    ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
            System.exit(1);
        }

        saldo += valor;
    }

    protected boolean sacar(double valor) {
        if(saldo - valor < 0) return false;
        saldo -= valor;
        return true;
    }

    boolean transferir(ContaCorrente conta) {
        double valorDeTransferencia = this.getSaldo();
        this.sacar(valorDeTransferencia); // Retirando valor da conta
        conta.depositar(valorDeTransferencia); // Transferindo o valor
        return true;
    }

    @Override
    public String toString() {
        return String.format("%f\n", saldo);
    }
}
