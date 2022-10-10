package questao2;

class Carro {
    private String modelo;
    private int ano;
    private int quantidadeDePessoas;
    private int capacidadeMaxima;

    public Carro(String modelo, int ano, int quantidadeDePessoas, int capacidadeMaxima) {
        if(quantidadeDePessoas > capacidadeMaxima) {
            System.out.println(String.format("O carro do modelo %s não consegue suportar mais de %d pessoas", modelo, capacidadeMaxima));
            System.exit(1);
        }
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    int getQuantidadeDePessoasNoCarro() {
        return quantidadeDePessoas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("-=-=-=-=-=-=-=-=\nModelo: %s\nAno: %d\nQuantidade de pessoas: %d\n-=-=-=-=-=", modelo,
                ano, quantidadeDePessoas);
    }
}