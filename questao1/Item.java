class Item {
    private String name;
    private double value;

    Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getNome() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("\t- Nome do item: %s\n\t- value do item: %f", name, value);
    }
}