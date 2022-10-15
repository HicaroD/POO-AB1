package questao4;

public class PaymentSlip extends PaymentMethod { // Boleto
    @Override
    public void pagar() {
        System.out.println("Efetuando pagamento com boleto");       
    }
}
