package Step4.Step4_Link5.Step4_Link5_3;
/*
Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle.
Override the calculateArea() method in each subclass to calculate and return the shape's area.

Напишите программу на Java для создания базового класса Shape с методом calculateArea().
Создайте три подкласса: Circle, Rectangle и Triangle.
Переопределите метод calculateArea() в каждом подклассе, чтобы вычислить и вернуть площадь фигуры.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(9, 10);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
    }
}
