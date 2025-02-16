package Step4.Step4_Link7.Step4_Link7_3;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double cash) {
        if (cash > 0) {
            setBalance(getBalance() + cash);
            System.out.println("Баланс Текущего счёта пополнен на " + cash + "$. Ваш баланс " + getBalance() + "$");
        } else {
            System.out.println("Операция невозможна. Ваш баланс " + getBalance() + "$");
        }
    }

    @Override
    public void withdraw(double cash) {
        if (cash > getBalance() || cash <= 0) {
            System.out.println("Операция невозможна. Ваш баланс " + getBalance() + "$");
        } else {
            setBalance(getBalance() - cash);
            System.out.println("Вы сняли " + cash + "$. Ваш баланс " + getBalance() + "$");

        }
    }
}
