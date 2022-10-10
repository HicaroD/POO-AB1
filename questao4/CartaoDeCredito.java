package questao4;

public class CartaoDeCredito extends MetodoDePagamento {
    @Override
    public void pagar() {
        System.out.println("Efetuando pagamento com cartão de crédito");
    }
}
