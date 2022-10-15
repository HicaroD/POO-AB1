import java.util.ArrayList;

class Product {
    private String name;
    private ArrayList<Item> items;

    public Product(String name, ArrayList<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getValor() {
        double valor = 0;
        for (Item item : items) valor += item.getValue();
        return valor;
    }

    @Override
    public String toString() {
        String items = "";
        for (Item item : this.items) items += String.format("%s\n\n", item);
        
        return String.format("-=-=-=-=-=-=-=-=-=-\nNome do produto: %s\nValor: %f\nItens:\n%s\n-=-=-=-=-=-=-=-=-=-", name, getValor(), items);
    }
}