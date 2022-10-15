package questao4;

public class PaymentSlip extends PaymentMethod { // Boleto
    @Override
    public void pay() {
        System.out.println("Efetuando pagamento com boleto");       
    }
}
