package Step4.Step4_Link7.Step4_Link7_2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь круга = " + Math.PI*radius*radius);
    }
}
