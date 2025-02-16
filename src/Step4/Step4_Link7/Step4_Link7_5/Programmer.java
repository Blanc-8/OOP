package Step4.Step4_Link7.Step4_Link7_5;

public class Programmer extends Employee{

    private int overHour;

    public Programmer(String role, int cash, int overHour) {
        super(role, cash);
        this.overHour = overHour;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Зарплата с переработками " + (getCash()+(getOverHour()*(getCash()/160))));
    }

    @Override
    public void displayInfo() {
        System.out.println("Должность: " + getRole() + ". Зарплата: " + getCash() + ". Переработки (в часах) : " + getOverHour());
    }

    public int getOverHour() {
        return overHour;
    }

    public void setOverHour(int overHour) {
        this.overHour = overHour;
    }
}
