package Step8.Step8_Link1.Step8_Link1_7;
/*
Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

Напишите программу на Java, которая создает банковский счет с одновременным пополнением и снятием средств с помощью потоков.
 */
public class BankAccount {
    private int cash;

    public BankAccount(int cash) {
        this.cash = cash;
    }

    public synchronized void addCash (int sum) {
        if (sum > 0) {
            cash += sum;
            System.out.println("Баланс пополнен на " + sum  + ". Всего на счёте: " + cash);
        } else {
            System.out.println("Некорректная сумма");
        }
    }

    public synchronized void makeCash (int sum) {
        if (sum <= cash) {
            cash -= sum;
            System.out.println("Вывели " + sum  + ". Осталось на счёте: " + cash);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

}
