package Step4.Step4_Link7.Step4_Link7_3;
/*
Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement
the respective methods to handle deposits and withdrawals for each account type.

Напишите программу на Java для создания абстрактного класса BankAccount с абстрактными методами deposit() и withdraw().
Создайте подклассы: SavingsAccount и CurrentAccount, которые расширяют класс BankAccount и реализуют
соответствующие методы для обработки пополнения и снятия средств для каждого типа счета.
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(115, 0);
        CurrentAccount currentAccount = new CurrentAccount(208, 500);
        // Меня смущает вызвать метод setBalance из этого класса
        savingsAccount.deposit(1000);
        savingsAccount.getBalance();
        savingsAccount.withdraw(800);
        savingsAccount.getBalance();
        savingsAccount.withdraw(400);
        savingsAccount.deposit(-800);
        savingsAccount.withdraw(-500);
        System.out.println("");
        currentAccount.deposit(1000);
        currentAccount.getBalance();
        currentAccount.withdraw(800);
        currentAccount.getBalance();
        currentAccount.withdraw(1400);
        savingsAccount.deposit(-800);
        savingsAccount.withdraw(-500);


    }
}
