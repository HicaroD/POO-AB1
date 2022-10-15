import java.util.ArrayList;

class Purchase {
    private ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product produto) {
        products.add(produto);
    }

    double total() {
        double total = 0;

        for (Product product : products) {
            total += product.getValor();
        }

        return total;
    }

    void listProducts() {
        for (Product product : products) System.err.println(product);
    }
}