package questao6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CheckingAccount> contas = new ArrayList<>();
        contas.add(new CheckingAccount(500));
        contas.add(new SpecialAccount(500, 300));

        Client cliente = new Client("Hícaro", contas);
        CheckingAccount contaCorrente = cliente.getAccounts().get(0);

        if(contaCorrente.withdraw(100)) {
            System.out.println("Saquei 100 reais da conta corrente");
        }

        CheckingAccount contaEspecial = cliente.getAccounts().get(1);
        if(contaEspecial.withdraw(800)) {
            System.out.println("Sacando 800 reais da conta especial");
        }
        System.out.println(contaEspecial.getBalance());
    } 
}
