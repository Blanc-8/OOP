package Step4.Step4_Link7.Step4_Link7_2;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника: " + Math.sqrt(p * (p - a) * (p - b) * (p-c)));
    }
}
