package questao4;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Efetuando pagamento com cartão de crédito");
    }
}
