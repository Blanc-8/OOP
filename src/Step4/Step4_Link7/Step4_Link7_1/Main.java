package Step4.Step4_Link7.Step4_Link7_1;

public class Main {
    /*
    Write a Java program to create an abstract class Animal with an abstract method called sound().
    Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method
    to make a specific sound for each animal.
    Напишите программу на Java для создания абстрактного класса Animal с абстрактным методом sound().
    Создайте подклассы Lion и Tiger, которые расширяют класс Animal и реализуют метод sound()
    для создания специфического звука для каждого животного.
     */
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }

}
