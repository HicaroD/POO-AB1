package questao6;

class SpecialAccount extends CheckingAccount {
    private float limit;

    public SpecialAccount(float limit) {
        this.balance = 0;
        this.limit = limit;
    }

    public SpecialAccount(double balance, float limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    protected boolean withdraw(double value) {
        if (balance + limit - value < 0) return false;
        balance -= value;
        return true;
    }
}