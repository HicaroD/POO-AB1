import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        ArrayList<Item> itensDaTv = new ArrayList<>();
        itensDaTv.add(new Item("Tela", 300));
        itensDaTv.add(new Item("Carcaça", 200));
        compra.adicionarProduto(new Produto("Televisão", itensDaTv));

        ArrayList<Item> itensDoJogo = new ArrayList<>();
        itensDoJogo.add(new Item("Conteúdo do jogo", 90));
        itensDoJogo.add(new Item("CD", 10));
        compra.adicionarProduto(new Produto("Jogo: Counter-Strike", itensDoJogo));

        compra.listarProdutos();
        System.out.println("Valor total: " + compra.total());
    }
}
