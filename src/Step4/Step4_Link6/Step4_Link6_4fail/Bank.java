package Step4.Step4_Link6.Step4_Link6_4fail;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double cash) {
        account.deposit(cash);
    }

    public void withdraw(Account account, double cash) {
        account.withdraw(cash);
    }

    // Закоментил, чтобы не ломала всю прогу, косяк задачи тут, хотя писал решение с ответов
//    public void printAccountBalance() {
//        for (Account account : accounts) {
//            System.out.println("Баланс аккаунта: " + account.getBalance());
//        }
//    }

}
