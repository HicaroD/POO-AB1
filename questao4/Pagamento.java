package questao4;

class Payment {
    private PaymentMethod metodoDePagamento;

    public Payment(PaymentMethod metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void setPaymentMethod(PaymentMethod metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pay() {
        metodoDePagamento.pay();
    }
}