package questao4;

public class Boleto extends MetodoDePagamento {
    @Override
    public void pagar() {
        System.out.println("Efetuando pagamento com boleto");       
    }
}
