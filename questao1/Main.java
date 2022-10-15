import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Purchase compra = new Purchase();
        ArrayList<Item> itensDaTv = new ArrayList<>();
        itensDaTv.add(new Item("Tela", 300));
        itensDaTv.add(new Item("Carcaça", 200));
        compra.addProduct(new Product("Televisão", itensDaTv));

        ArrayList<Item> itensDoJogo = new ArrayList<>();
        itensDoJogo.add(new Item("Conteúdo do jogo", 90));
        itensDoJogo.add(new Item("CD", 10));
        compra.addProduct(new Product("Jogo: Counter-Strike", itensDoJogo));

        compra.listProducts();
        System.out.println("Valor total: " + compra.total());
    }
}
