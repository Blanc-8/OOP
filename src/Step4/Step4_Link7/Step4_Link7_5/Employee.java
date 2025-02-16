package Step4.Step4_Link7.Step4_Link7_5;

public abstract class Employee {

    private String role;
    private int cash;

    public abstract void calculateSalary();
    public abstract void displayInfo();

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Employee(String role, int cash) {
        this.role = role;
        this.cash = cash;
    }
}
