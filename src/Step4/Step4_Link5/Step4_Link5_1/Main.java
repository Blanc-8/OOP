package Step4.Step4_Link5.Step4_Link5_1;
/*
Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat.
Override the Sound() method in each subclass to make a specific sound for each animal.

Напишите программу на Java для создания базового класса Animal (семейство животных) с методом Sound(). Создайте два подкласса Bird и Cat.
Переопределите метод Sound() в каждом подклассе, чтобы создать определенный звук для каждого животного.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        bird.sound();
        cat.sound();
    }
}
