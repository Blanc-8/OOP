package Step4.Step4_Link7.Step4_Link7_11;
/*
Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods
to describe how each bird flies and makes a sound.

Напишите программу на Java для создания абстрактного класса Bird с абстрактными методами fly() и makeSound().
Создайте подклассы Eagle и Hawk, которые расширяют класс Bird и реализуют соответствующие методы, чтобы описать,
как каждая птица летает и издает звук.
 */
public class Main {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Eagle eagle = new Eagle();
        hawk.fly();
        hawk.makeSound();
        eagle.fly();
        eagle.makeSound();
    }
}
