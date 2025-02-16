package Step4.Step4_Link6.Step4_Link6_5;
/*
Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height)
that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.

Напишите программу на Java для создания интерфейса Resizable с методами resizeWidth(int width) и resizeHeight(int height),
которые позволяют изменять размеры объекта. Создайте класс Rectangle, который реализует интерфейс Resizable и
реализует методы изменения размера.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        rectangle.resizeHeight(20);
        rectangle.resizeWidth(2);
        System.out.println(rectangle);
    }
}
