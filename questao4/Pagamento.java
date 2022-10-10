package questao4;

class Pagamento {
    private MetodoDePagamento metodoDePagamento;

    public Pagamento(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pagar() {
        metodoDePagamento.pagar();
    }
}