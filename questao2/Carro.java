package questao2;

class Car {
    private String model;
    private int year;
    private int personQuantity;
    private int maximumCapacity;

    public Car(String model, int year, int personQuantity, int maximumCapacity) {
        if (personQuantity > maximumCapacity) {
            System.out.println(String.format("O carro do modelo %s não consegue suportar mais de %d pessoas", model,
                    maximumCapacity));
            System.exit(1);
        }
        this.model = model;
        this.year = year;
        this.personQuantity = personQuantity;
        this.maximumCapacity = maximumCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPersonQuantity() {
        return personQuantity;
    }

    public void setPersonQuantity(int personQuantity) {
        this.personQuantity = personQuantity;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    @Override
    public String toString() {
        return String.format("-=-=-=-=-=-=-=-=\nModelo: %s\nAno: %d\nQuantidade de pessoas: %d\n-=-=-=-=-=", model,
                year, personQuantity);
    }
}