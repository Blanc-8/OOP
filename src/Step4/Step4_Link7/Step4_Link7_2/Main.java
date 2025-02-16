package Step4.Step4_Link7.Step4_Link7_2;

/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods
to calculate the area and perimeter of each shape.
Напишите программу на Java для создания абстрактного класса Shape с абстрактными методами calculateArea() и calculatePerimeter().
Создайте подклассы Circle и Triangle, которые расширяют класс Shape и реализуют соответствующие методы
для вычисления площади и периметра каждой фигуры.
 */

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.6);
        circle.calculateArea();
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.calculateArea();
    }
}
