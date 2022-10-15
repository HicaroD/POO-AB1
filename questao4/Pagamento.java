package questao4;

class Pagamento {
    private PaymentMethod metodoDePagamento;

    public Pagamento(PaymentMethod metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void setPaymentMethod(PaymentMethod metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pagar() {
        metodoDePagamento.pagar();
    }
}