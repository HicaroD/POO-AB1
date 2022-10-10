package questao6;

class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float limite) {
        this.saldo = 0;
        this.limite = limite;
    }

    public ContaEspecial(double saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    protected boolean sacar(double valor) {
        if (valor + limite - saldo < 0) return false;
        saldo -= valor;
        return true;
    }
}