package questao6;

import java.util.ArrayList;

class Client {
    private String name;
    private ArrayList<CheckingAccount> accounts;

    public Client() {
        this.name = "";
        this.accounts = new ArrayList<>();
    }

    public Client(String name, ArrayList<CheckingAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public ArrayList<CheckingAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\n", name);
    }
}