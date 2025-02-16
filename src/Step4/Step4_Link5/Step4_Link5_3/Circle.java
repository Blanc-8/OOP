package Step4.Step4_Link5.Step4_Link5_3;

public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
