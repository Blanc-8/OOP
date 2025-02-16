package Step4.Step4_Link6.Step4_Link6_4fail;
/*
Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount.
The bank should have a list of accounts and methods for adding them.
Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

Напишите программу на Java для создания банковской системы с тремя классами - Bank, Account, SavingsAccount и CurrentAccount.
Банк должен иметь список счетов и методы для их добавления.
Счета должны представлять собой интерфейс с методами для пополнения, снятия, начисления процентов и просмотра остатков.
SavingsAccount и CurrentAccount должны реализовывать интерфейс Account и иметь свои собственные уникальные методы.
 */
public class Main {

    /*
    Очень мутное задание. Попробовал сам - не пошло. Решил залезть в ответы
    https://www.w3resource.com/java-exercises/java-interface-exercise-4.php
    и написать как там - прога вообще не работает, косяки в классе Bank.
    Сама архитектура решения вызывает вопросы, но тут возможно я не догоняю.
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000, 1.25);
        bank.addAccount(savingsAccount);
        System.out.println("Накопительный счёт: Начальный депозит " + savingsAccount.getBalance() + "$ под "
                + savingsAccount.getInterestRate() + "% годовых");

        CurrentAccount currentAccount = new CurrentAccount(5000, 1000);
        bank.addAccount(currentAccount);
        System.out.println("Обычный счёт: Баланс счёта " + savingsAccount.getBalance() + "$. Овердрафт "
                + currentAccount.getOverdraftLimit() + "$");

        bank.deposit(savingsAccount, 100);
        System.out.println("Вы положили 100$ на накопительный счёт");
        bank.deposit(currentAccount, 500);
        System.out.println("Вы положили 500$ на обычный счёт");



    }
}
