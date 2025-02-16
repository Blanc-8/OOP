package Step4.Step4_Link6.Step4_Link6_4fail;

public interface Account {
    //Счета должны представлять собой интерфейс с методами для пополнения, снятия, начисления процентов и просмотра остатков.
    public void deposit(double cash);
    public void withdraw(double cash);
    public double getBalance();
}
