package Step5.Step5_Link4.Step5_Link4_3;
/*
 Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

 Напишите программу на Java для реализации перечисления «Shape» с константами, представляющими различные геометрические фигуры.
 */
public class Main {
    public enum Shape {
        TRIANGLE,
        CIRCLE,
        SQUARE,
        RECTANGLE
    }

    public static void main(String[] args) {
        Shape shape1 = Shape.TRIANGLE;
        Shape shape2 = Shape.CIRCLE;
        Shape shape3 = Shape.SQUARE;
        Shape shape4 = Shape.RECTANGLE;
        System.out.println("Фигура: " + shape1);
        System.out.println("Фигура: " + shape2);
        System.out.println("Фигура: " + shape3);
        System.out.println("Фигура: " + shape4);
    }
}
