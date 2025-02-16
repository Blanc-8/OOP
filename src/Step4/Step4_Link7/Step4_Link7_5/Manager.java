package Step4.Step4_Link7.Step4_Link7_5;

public class Manager extends Employee{

    private double bonus;

    public Manager(String role, int cash, double bonus) {
        super(role, cash);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Зарплата с бонусом " + (getCash()+bonus));
    }

    @Override
    public void displayInfo() {
        System.out.println("Должность: " + getRole() + ". Зарплата: " + getCash() + ". Бонус: " + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
