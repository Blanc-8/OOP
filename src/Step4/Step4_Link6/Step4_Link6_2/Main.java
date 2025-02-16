package Step4.Step4_Link6.Step4_Link6_2;
/*
Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".

Напишите программу на Java для создания интерфейса Animal с методом bark(), который не принимает аргументов и возвращает void.
Создайте класс Dog, который реализует Animal и переопределяет speak() для печати «Собака лает».
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
