package questao6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(500));
        contas.add(new ContaEspecial(500, 300));

        Cliente cliente = new Cliente("Hícaro", contas);
    } 
}
