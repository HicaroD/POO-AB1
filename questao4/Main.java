package questao4;

public class Main {
    public static void main(String[] args) {
        PIX pix = new PIX();
        Pagamento pagamento = new Pagamento(pix);
        pagamento.pagar();

        Boleto boleto = new Boleto();
        pagamento.setMetodoDePagamento(boleto);
        pagamento.pagar();
    } 
}
