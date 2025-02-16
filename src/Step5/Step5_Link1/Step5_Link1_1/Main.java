package Step5.Step5_Link1.Step5_Link1_1;
/*
Write a Java program to create a class called "Counter" with a static variable count.
Implement a constructor that increments count every time an object is created.
Print the value of count after creating several objects.

Напишите программу на Java для создания класса «Counter» со статической переменной count.
Реализуйте конструктор, который увеличивает count каждый раз, когда создается объект.
Выведите значение count после создания нескольких объектов.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Counter.getCount());
        Counter counter1 = new Counter();
        System.out.println(Counter.getCount());
        Counter counter2 = new Counter();
        System.out.println(Counter.getCount());
        Counter counter3 = new Counter();
        System.out.println(Counter.getCount());
    }
}
