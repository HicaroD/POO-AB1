package questao4;

public class Main {
    public static void main(String[] args) {
        PIX pix = new PIX();
        Payment pagamento = new Payment(pix);
        pagamento.pay();

        PaymentMethod boleto = new PaymentSlip();
        pagamento.setPaymentMethod(boleto);
        pagamento.pay();
    } 
}
