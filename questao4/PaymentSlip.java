package questao4;

public class PaymentSlip implements PaymentMethod { // Boleto
    @Override
    public void pay() {
        System.out.println("Efetuando pagamento com boleto");       
    }
}
