package Step4.Step4_Link6.Step4_Link6_4fail;

public class SavingsAccount implements Account{
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double cash) {
        balance += cash;
    }

    @Override
    public void withdraw(double cash) {
        balance -= cash;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }

}
