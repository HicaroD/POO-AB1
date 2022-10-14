package questao2;

import java.util.ArrayList;

class Estacionamento {
    private ArrayList<Car> cars = new ArrayList<>();

    void adicionarCarro(Car car) {
        cars.add(car);
    }

    int getQuantidadeDePessoasNoEstacionamento() {
        int totalDePessoas = 0;
        for (Car car : cars) { 
            totalDePessoas += car.getPersonQuantity();
        }
        return totalDePessoas;
    }

    void listarCarrosNoEstacionamento() {
        for (Car car : cars) System.out.println(car);
    }
}