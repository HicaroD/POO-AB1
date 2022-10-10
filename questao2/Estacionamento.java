package questao2;

import java.util.ArrayList;

class Estacionamento {
    private ArrayList<Carro> carros = new ArrayList<>();

    void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    int getQuantidadeDePessoasNoEstacionamento() {
        int totalDePessoas = 0;
        for (Carro carro : carros) { 
            totalDePessoas += carro.getQuantidadeDePessoasNoCarro();
        }
        return totalDePessoas;
    }

    void listarCarrosNoEstacionamento() {
        for (Carro carro : carros) System.out.println(carro);
    }
}