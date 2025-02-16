package Step4.Step4_Link6.Step4_Link6_4fail;

public class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double cash) {
        balance += cash;
    }

    @Override
    public void withdraw(double cash) {
        if (balance + overdraftLimit >= cash) {
            balance -= cash;
        } else {
            System.out.println("Операция невозможна");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
