package questao2;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(new Car("Fiat Marea Turbo", 2012, 3, 4));
        estacionamento.adicionarCarro(new Car("Ferrari", 2021, 4, 4));
        estacionamento.listarCarrosNoEstacionamento();
    } 
}
