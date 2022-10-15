package questao6;

class CheckingAccount { // Conta corrente
    protected double balance;

    CheckingAccount() {
        balance = 0;
    }

    CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void depositar(double value) {
        if (value < 0) {
            System.out.println("Valor inválido");
            System.exit(1);
        }

        balance += value;
    }

    protected boolean withdraw(double value) {
        if(balance - value < 0) return false;
        balance -= value;
        return true;
    }

    boolean transfer(CheckingAccount account) {
        double transferValue = this.getBalance();
        this.withdraw(transferValue); // Retirando valor da conta
        account.depositar(transferValue); // Transferindo o valor
        return true;
    }

    @Override
    public String toString() {
        return String.format("%f\n", balance);
    }
}
