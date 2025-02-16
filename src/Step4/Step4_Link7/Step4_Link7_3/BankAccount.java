package Step4.Step4_Link7.Step4_Link7_3;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double cash);
    public abstract void withdraw(double cash);
}
